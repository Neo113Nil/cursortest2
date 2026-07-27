package com.unity3d.ads.core.data.manager;

import androidx.compose.material.TextFieldImplKt;
import com.facebook.appevents.internal.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.Timestamp;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: TransactionEventManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 134, 147, TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {"transactionDataList", "deferredPurchaseList", FirebaseAnalytics.Event.PURCHASE, "productId", Constants.GP_IAP_PURCHASE_TIME, "index$iv", "index", "transactionDataList", "deferredPurchaseList", FirebaseAnalytics.Event.PURCHASE, "index$iv", "index", "transactionDataList"}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$4", "I$0", "I$1", "L$0"})
/* loaded from: classes7.dex */
final class TransactionEventManager$onPurchasesReceived$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<PurchaseBridge> $purchases;
    final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransactionEventManager$onPurchasesReceived$1(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, Continuation<? super TransactionEventManager$onPurchasesReceived$1> continuation) {
        super(2, continuation);
        this.$purchases = list;
        this.this$0 = transactionEventManager;
        this.$transactionOrigin = transactionOrigin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransactionEventManager$onPurchasesReceived$1(this.$purchases, this.this$0, this.$transactionOrigin, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransactionEventManager$onPurchasesReceived$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:33|(1:35)|36|37|38|39|40|41|42|(1:44)|(2:85|86)(1:46)|47|(1:49)(1:84)|(2:56|(1:58)(4:59|60|61|(5:63|64|65|66|(1:68)(9:69|24|25|(0)|28|29|30|31|(6:93|(1:95)|15|(0)|9|10)(0)))(6:74|28|29|30|31|(0)(0))))|77|78|79|80|30|31|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:63|64|65|66|(1:68)(9:69|24|25|(0)|28|29|30|31|(6:93|(1:95)|15|(0)|9|10)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cb, code lost:
    
        r12 = r4;
        r11 = r13;
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        r5 = r2;
        r2 = r4;
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dd, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01df, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a8 A[Catch: Exception -> 0x01e3, TryCatch #7 {Exception -> 0x01e3, blocks: (B:25:0x01a2, B:27:0x01a8, B:28:0x01be), top: B:24:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e A[Catch: Exception -> 0x01ca, TRY_LEAVE, TryCatch #6 {Exception -> 0x01ca, blocks: (B:61:0x0164, B:63:0x017e), top: B:60:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x019e -> B:24:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01e3 -> B:29:0x01ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01ba -> B:28:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01db -> B:30:0x01f0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Iterator it;
        List list;
        TransactionEventManager transactionEventManager;
        int i;
        char c;
        int i2;
        List<TransactionEventRequestOuterClass.TransactionData> list2;
        int i3;
        List list3;
        Object obj2;
        Iterator it2;
        PurchaseBridge purchaseBridge;
        String str;
        Duration duration;
        TransactionEventManager transactionEventManager2;
        ProductDetailsFetcher productDetailsFetcher;
        Object fetchProductDetails;
        Duration m9424boximpl;
        String str2;
        ByteStringDataSource byteStringDataSource;
        GetTransactionData getTransactionData;
        GetTransactionRequest getTransactionRequest;
        BillingClientAdapter billingClientAdapter;
        Object invoke;
        TransactionEventRepository transactionEventRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        char c2 = 2;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList();
            List<PurchaseBridge> list4 = this.$purchases;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (PurchaseBridge purchaseBridge2 : list4) {
                arrayList2.add(CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
            }
            List<PurchaseBridge> list5 = this.$purchases;
            TransactionEventManager transactionEventManager3 = this.this$0;
            it = list5.iterator();
            list = arrayList2;
            transactionEventManager = transactionEventManager3;
            i = 0;
            if (!it.hasNext()) {
            }
        } else {
            if (i4 == 1) {
                i3 = this.I$1;
                i2 = this.I$0;
                duration = (Duration) this.L$6;
                str = (String) this.L$5;
                purchaseBridge = (PurchaseBridge) this.L$4;
                it2 = (Iterator) this.L$3;
                TransactionEventManager transactionEventManager4 = (TransactionEventManager) this.L$2;
                list3 = (List) this.L$1;
                List<TransactionEventRequestOuterClass.TransactionData> list6 = (List) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    list2 = list6;
                    transactionEventManager2 = transactionEventManager4;
                    obj2 = obj;
                } catch (Exception unused) {
                    list2 = list6;
                    it = it2;
                    transactionEventManager = transactionEventManager4;
                    list = list3;
                }
                if (Timestamp.parseFrom(((ByteStringStoreOuterClass.ByteStringStore) obj2).getData()).getSeconds() >= Duration.m9440getInWholeSecondsimpl(duration.getRawValue())) {
                }
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        invoke = obj;
                        transactionEventRepository = this.this$0.transactionEventRepository;
                        transactionEventRepository.addTransactionEvent((TransactionEventRequestOuterClass.TransactionEventRequest) invoke);
                        return Unit.INSTANCE;
                    }
                    arrayList = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!arrayList.isEmpty()) {
                        getTransactionRequest = this.this$0.getTransactionRequest;
                        billingClientAdapter = this.this$0.billingClientAdapter;
                        this.L$0 = null;
                        this.label = 4;
                        invoke = getTransactionRequest.invoke(arrayList, billingClientAdapter.getAdapterVersion(), this.$transactionOrigin, this);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        transactionEventRepository = this.this$0.transactionEventRepository;
                        transactionEventRepository.addTransactionEvent((TransactionEventRequestOuterClass.TransactionEventRequest) invoke);
                    }
                    return Unit.INSTANCE;
                }
                i3 = this.I$1;
                i2 = this.I$0;
                PurchaseBridge purchaseBridge3 = (PurchaseBridge) this.L$4;
                it = (Iterator) this.L$3;
                transactionEventManager = (TransactionEventManager) this.L$2;
                list = (List) this.L$1;
                List<TransactionEventRequestOuterClass.TransactionData> list7 = (List) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    list2 = list7;
                    c = 2;
                    fetchProductDetails = obj;
                } catch (Exception unused2) {
                    list2 = list7;
                }
                ProductDetailsResult productDetailsResult = (ProductDetailsResult) fetchProductDetails;
                if (productDetailsResult instanceof ProductDetailsResult.Success) {
                    getTransactionData = transactionEventManager.getTransactionData;
                    list2.add(getTransactionData.invoke(purchaseBridge3, ((ProductDetailsResult.Success) productDetailsResult).getProductDetailsJson()));
                }
                ((CompletableDeferred) list.get(i3)).complete(Unit.INSTANCE);
                arrayList = list2;
                i = i2;
                c2 = c;
                if (!it.hasNext()) {
                    Object next = it.next();
                    int i5 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    PurchaseBridge purchaseBridge4 = (PurchaseBridge) next;
                    Long boxLong = Boxing.boxLong(purchaseBridge4.getOriginalJson().optLong(Constants.GP_IAP_PURCHASE_TIME, -1L));
                    if (boxLong.longValue() < 0) {
                        boxLong = null;
                    }
                    if (boxLong != null) {
                        try {
                        } catch (Exception unused3) {
                            list2 = arrayList;
                            i3 = i;
                            i2 = i5;
                            c = 2;
                        }
                        Duration.Companion companion = Duration.INSTANCE;
                        m9424boximpl = Duration.m9424boximpl(DurationKt.toDuration(boxLong.longValue(), DurationUnit.MILLISECONDS));
                    } else {
                        m9424boximpl = null;
                    }
                    String optString = purchaseBridge4.getOriginalJson().optString("productId");
                    Intrinsics.checkNotNull(optString);
                    if (StringsKt.isBlank(optString)) {
                        optString = null;
                    }
                    if (m9424boximpl != null && (str2 = optString) != null && !StringsKt.isBlank(str2)) {
                        byteStringDataSource = transactionEventManager.iapTransactionStore;
                        this.L$0 = arrayList;
                        this.L$1 = list;
                        this.L$2 = transactionEventManager;
                        this.L$3 = it;
                        this.L$4 = purchaseBridge4;
                        this.L$5 = optString;
                        this.L$6 = m9424boximpl;
                        this.I$0 = i5;
                        this.I$1 = i;
                        this.label = 1;
                        obj2 = byteStringDataSource.get(this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list3 = list;
                        it2 = it;
                        str = optString;
                        Duration duration2 = m9424boximpl;
                        list2 = arrayList;
                        i3 = i;
                        transactionEventManager2 = transactionEventManager;
                        purchaseBridge = purchaseBridge4;
                        i2 = i5;
                        duration = duration2;
                        try {
                        } catch (Exception unused4) {
                            c = 2;
                        }
                        if (Timestamp.parseFrom(((ByteStringStoreOuterClass.ByteStringStore) obj2).getData()).getSeconds() >= Duration.m9440getInWholeSecondsimpl(duration.getRawValue())) {
                            productDetailsFetcher = transactionEventManager2.productDetailsFetcher;
                            this.L$0 = list2;
                            this.L$1 = list3;
                            this.L$2 = transactionEventManager2;
                            this.L$3 = it2;
                            this.L$4 = purchaseBridge;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.I$0 = i2;
                            this.I$1 = i3;
                            c = 2;
                            this.label = 2;
                            fetchProductDetails = productDetailsFetcher.fetchProductDetails(str, this);
                            if (fetchProductDetails == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            purchaseBridge3 = purchaseBridge;
                            it = it2;
                            list = list3;
                            transactionEventManager = transactionEventManager2;
                            ProductDetailsResult productDetailsResult2 = (ProductDetailsResult) fetchProductDetails;
                            if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
                            }
                            ((CompletableDeferred) list.get(i3)).complete(Unit.INSTANCE);
                            arrayList = list2;
                            i = i2;
                            c2 = c;
                            if (!it.hasNext()) {
                                CompletableDeferred[] completableDeferredArr = (CompletableDeferred[]) list.toArray(new CompletableDeferred[0]);
                                this.L$0 = arrayList;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.label = 3;
                                if (AwaitKt.awaitAll((Deferred[]) Arrays.copyOf(completableDeferredArr, completableDeferredArr.length), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (!arrayList.isEmpty()) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            c = 2;
                            transactionEventManager = transactionEventManager2;
                            it = it2;
                            list = list3;
                            ((CompletableDeferred) list.get(i3)).complete(Unit.INSTANCE);
                            arrayList = list2;
                            i = i2;
                            c2 = c;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                    c = 2;
                    ((CompletableDeferred) list.get(i)).complete(Unit.INSTANCE);
                    i = i5;
                    c2 = c;
                    if (!it.hasNext()) {
                    }
                }
            }
            c = 2;
            ((CompletableDeferred) list.get(i3)).complete(Unit.INSTANCE);
            arrayList = list2;
            i = i2;
            c2 = c;
            if (!it.hasNext()) {
            }
        }
    }
}
