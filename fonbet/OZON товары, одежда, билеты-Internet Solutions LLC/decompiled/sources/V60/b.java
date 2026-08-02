package V60;

import N3.C3660k;
import Sc.o;
import Sc.s;
import a70.InterfaceC4958a;
import androidx.recyclerview.widget.LinearLayoutManager;
import e70.InterfaceC6317d;
import g.C6594f;
import g30.InterfaceC6618a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n70.EnumC8449a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomData;
import ru.ozon.fintech.features.offline.data.model.main.AccountData;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.Commissions;
import ru.ozon.fintech.features.offline.data.model.transfer.LimitCents;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;

/* loaded from: classes3.dex */
public final class b implements V60.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4958a f28351a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z60.a f28352b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final K70.b f28353c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Y60.b<MainData> f28354d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Y60.b<TransferData> f28355e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Y60.b<CbottomData> f28356f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f28357g;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28358a;

        static {
            int[] iArr = new int[EnumC8449a.EnumC1291a.values().length];
            try {
                iArr[EnumC8449a.EnumC1291a.DATE_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8449a.EnumC1291a.MIN_LIMIT_KEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8449a.EnumC1291a.MAX_LIMIT_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8449a.EnumC1291a.SMS_YOU_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC8449a.EnumC1291a.SMS_RECIPIENT_KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC8449a.EnumC1291a.AFTER_SUM_KEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC8449a.EnumC1291a.BEFORE_SUM_KEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC8449a.EnumC1291a.AMOUNT_KEY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC8449a.EnumC1291a.SMS_AMOUNT_KEY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f28358a = iArr;
        }
    }

    public b(@NotNull InterfaceC4958a remoteDataSource, @NotNull Z60.a localDataSource, @NotNull K70.b otpSmsInteractor, @NotNull Y60.b<MainData> mainDataTransformer, @NotNull Y60.b<TransferData> transferDataTransformer, @NotNull Y60.b<CbottomData> cbottomDataTransformer, @NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(otpSmsInteractor, "otpSmsInteractor");
        Intrinsics.checkNotNullParameter(mainDataTransformer, "mainDataTransformer");
        Intrinsics.checkNotNullParameter(transferDataTransformer, "transferDataTransformer");
        Intrinsics.checkNotNullParameter(cbottomDataTransformer, "cbottomDataTransformer");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f28351a = remoteDataSource;
        this.f28352b = localDataSource;
        this.f28353c = otpSmsInteractor;
        this.f28354d = mainDataTransformer;
        this.f28355e = transferDataTransformer;
        this.f28356f = cbottomDataTransformer;
        this.f28357g = analyticInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Function1 function1, W60.a aVar, Y60.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        W60.a aVar2;
        b bVar2;
        InterfaceC6317d interfaceC6317d;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f28379i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f28379i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f28377g;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f28379i;
                if (i11 != 0) {
                    s.b(obj);
                    eVar.f28374d = this;
                    eVar.f28375e = aVar;
                    eVar.f28376f = bVar;
                    eVar.f28379i = 1;
                    obj = function1.invoke(eVar);
                    if (obj != aVar3) {
                        aVar2 = aVar;
                        bVar2 = this;
                    }
                    return aVar3;
                }
                if (i11 == 1) {
                    bVar = eVar.f28376f;
                    W60.a aVar4 = eVar.f28375e;
                    b bVar3 = eVar.f28374d;
                    s.b(obj);
                    bVar2 = bVar3;
                    aVar2 = aVar4;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        InterfaceC6317d interfaceC6317d2 = (InterfaceC6317d) obj;
                        if (interfaceC6317d2 instanceof InterfaceC6317d.a) {
                            return new InterfaceC6317d.a(((InterfaceC6317d.a) interfaceC6317d2).a());
                        }
                        if (interfaceC6317d2 instanceof InterfaceC6317d.b) {
                            return new InterfaceC6317d.b(Unit.f71690a);
                        }
                        throw new o();
                    }
                    aVar2 = eVar.f28375e;
                    bVar2 = eVar.f28374d;
                    s.b(obj);
                    InterfaceC6317d interfaceC6317d3 = (InterfaceC6317d) obj;
                    if (interfaceC6317d3 instanceof InterfaceC6317d.a) {
                        Intrinsics.checkNotNullParameter(interfaceC6317d3, "<this>");
                        if (interfaceC6317d3 != null) {
                            return new InterfaceC6317d.a(((InterfaceC6317d.a) interfaceC6317d3).a());
                        }
                        if (interfaceC6317d3 instanceof InterfaceC6317d.b) {
                            return new InterfaceC6317d.b(Unit.f71690a);
                        }
                        throw new o();
                    }
                    if (!(interfaceC6317d3 instanceof InterfaceC6317d.b)) {
                        throw new o();
                    }
                    String str = (String) ((InterfaceC6317d.b) interfaceC6317d3).a();
                    Z60.a aVar5 = bVar2.f28352b;
                    eVar.f28374d = null;
                    eVar.f28375e = null;
                    eVar.f28379i = 3;
                    obj = aVar5.l(aVar2, str, eVar);
                }
                interfaceC6317d = (InterfaceC6317d) obj;
                if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                    bVar2.f28357g.H(aVar2.name(), false);
                    return interfaceC6317d;
                }
                if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
                    throw new o();
                }
                bVar2.f28357g.H(aVar2.name(), true);
                Object a11 = ((InterfaceC6317d.b) interfaceC6317d).a();
                eVar.f28374d = bVar2;
                eVar.f28375e = aVar2;
                eVar.f28376f = null;
                eVar.f28379i = 2;
                obj = bVar.b(a11, eVar);
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f28377g;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f28379i;
        if (i11 != 0) {
        }
        interfaceC6317d = (InterfaceC6317d) obj2;
        if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(W60.a aVar, Y60.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        InterfaceC6317d interfaceC6317d;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f28387g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f28387g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f28385e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f28387g;
                if (i11 != 0) {
                    s.b(obj);
                    jVar.f28384d = bVar;
                    jVar.f28387g = 1;
                    obj = this.f28352b.h(aVar, jVar);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return obj;
                    }
                    bVar = jVar.f28384d;
                    s.b(obj);
                }
                interfaceC6317d = (InterfaceC6317d) obj;
                if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                    return interfaceC6317d;
                }
                if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
                    throw new o();
                }
                String str = (String) ((InterfaceC6317d.b) interfaceC6317d).a();
                jVar.f28384d = null;
                jVar.f28387g = 2;
                InterfaceC6317d a11 = bVar.a(str);
                return a11 == aVar2 ? aVar2 : a11;
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f28385e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f28387g;
        if (i11 != 0) {
        }
        interfaceC6317d = (InterfaceC6317d) obj2;
        if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
        }
    }

    @Override // V60.a
    public final long a() {
        return this.f28352b.a();
    }

    @Override // V60.a
    public final boolean b() {
        return this.f28353c.b();
    }

    @Override // V60.a
    public final Object c(@NotNull EnumC8449a enumC8449a, @NotNull kotlin.coroutines.d<? super InterfaceC6317d<String, Object>> dVar) {
        return this.f28352b.c(enumC8449a, dVar);
    }

    @Override // V60.a
    public final boolean d() {
        return this.f28352b.d();
    }

    @Override // V60.a
    public final boolean e(@NotNull W60.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f28352b.m(key);
    }

    @Override // V60.a
    public final Object f(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return r(new g(1, this.f28351a, InterfaceC4958a.class, "getCbottomDataFromNetwork", "getCbottomDataFromNetwork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), W60.a.CBOTTOM, this.f28356f, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // V60.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z11, boolean z12, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        b bVar;
        InterfaceC6317d interfaceC6317d;
        String smsTemplate;
        String X9;
        String X11;
        String X12;
        String X13;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f28373l;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f28373l = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f28371j;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f28373l;
                if (i11 != 0) {
                    s.b(obj);
                    W60.a aVar2 = W60.a.TRANSFER;
                    dVar.f28365d = this;
                    dVar.f28366e = str;
                    dVar.f28367f = str2;
                    dVar.f28368g = str3;
                    dVar.f28369h = z11;
                    dVar.f28370i = z12;
                    dVar.f28373l = 1;
                    obj = s(aVar2, this.f28355e, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z12 = dVar.f28370i;
                    z11 = dVar.f28369h;
                    str3 = dVar.f28368g;
                    str2 = dVar.f28367f;
                    str = dVar.f28366e;
                    bVar = dVar.f28365d;
                    s.b(obj);
                }
                interfaceC6317d = (InterfaceC6317d) obj;
                if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                    smsTemplate = null;
                } else {
                    if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
                        throw new o();
                    }
                    smsTemplate = ((TransferData) ((InterfaceC6317d.b) interfaceC6317d).a()).getSmsTemplate();
                }
                String c11 = G.g.c(!z11 ? "1" : "0", z12 ? "1" : "0", bVar.f28353c.c(str + "|" + str2 + "|" + str3));
                return (smsTemplate != null || (X9 = kotlin.text.h.X(smsTemplate, "<transfer_amount>", str, false)) == null || (X11 = kotlin.text.h.X(X9, "<phone_number>", str2, false)) == null || (X12 = kotlin.text.h.X(X11, "<bank_name>", str3, false)) == null || (X13 = kotlin.text.h.X(X12, "<code_id>", c11, false)) == null) ? C6594f.a(str3, ". ID: ", c11, C3660k.d("Перевести ", str, " ₽ на ", str2, " в ")) : X13;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f28371j;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f28373l;
        if (i11 != 0) {
        }
        interfaceC6317d = (InterfaceC6317d) obj2;
        if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
        }
        String c112 = G.g.c(!z11 ? "1" : "0", z12 ? "1" : "0", bVar.f28353c.c(str + "|" + str2 + "|" + str3));
        if (smsTemplate != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // V60.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(@NotNull EnumC8449a enumC8449a, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        List<EnumC8449a.EnumC1291a> d11;
        b bVar;
        InterfaceC6317d interfaceC6317d;
        List<EnumC8449a.EnumC1291a> list;
        MainData mainData;
        b bVar2;
        InterfaceC6317d interfaceC6317d2;
        AccountData accountData;
        String c11;
        LimitCents limitCents;
        LimitCents limitCents2;
        Commissions commissions;
        Commissions commissions2;
        Commissions commissions3;
        Commissions commissions4;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f28364i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f28364i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f28362g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f28364i;
                if (i11 != 0) {
                    s.b(obj);
                    d11 = enumC8449a.d();
                    if (d11 != null) {
                        W60.a aVar2 = W60.a.MAIN;
                        cVar2.f28359d = this;
                        cVar2.f28360e = d11;
                        cVar2.f28364i = 1;
                        obj = s(aVar2, this.f28354d, cVar2);
                        if (obj != aVar) {
                            bVar = this;
                        }
                        return aVar;
                    }
                    return null;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mainData = cVar2.f28361f;
                    list = cVar2.f28360e;
                    bVar2 = cVar2.f28359d;
                    s.b(obj);
                    interfaceC6317d2 = (InterfaceC6317d) obj;
                    if (!(interfaceC6317d2 instanceof InterfaceC6317d.a)) {
                        if (!(interfaceC6317d2 instanceof InterfaceC6317d.b)) {
                            throw new o();
                        }
                        TransferData transferData = (TransferData) ((InterfaceC6317d.b) interfaceC6317d2).a();
                        List<EnumC8449a.EnumC1291a> list2 = list;
                        int h11 = U.h(C7714v.z(list2, 10));
                        if (h11 < 16) {
                            h11 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                        for (EnumC8449a.EnumC1291a enumC1291a : list2) {
                            String name = enumC1291a.name();
                            bVar2.getClass();
                            String str = "";
                            switch (a.f28358a[enumC1291a.ordinal()]) {
                                case 1:
                                    if (mainData != null && (accountData = mainData.getAccountData()) != null) {
                                        c11 = d70.c.c(accountData.getUpdatedAtMs());
                                        if (c11 != null) {
                                            str = c11;
                                        }
                                        Pair pair = new Pair(name, str);
                                        linkedHashMap.put(pair.e(), pair.f());
                                    }
                                    c11 = null;
                                    if (c11 != null) {
                                    }
                                    Pair pair2 = new Pair(name, str);
                                    linkedHashMap.put(pair2.e(), pair2.f());
                                    break;
                                case 2:
                                    if (transferData != null && (limitCents = transferData.getLimitCents()) != null) {
                                        c11 = d70.c.g(limitCents.getMin());
                                        if (c11 != null) {
                                        }
                                        Pair pair22 = new Pair(name, str);
                                        linkedHashMap.put(pair22.e(), pair22.f());
                                    }
                                    c11 = null;
                                    if (c11 != null) {
                                    }
                                    Pair pair222 = new Pair(name, str);
                                    linkedHashMap.put(pair222.e(), pair222.f());
                                    break;
                                case 3:
                                    if (transferData != null && (limitCents2 = transferData.getLimitCents()) != null) {
                                        c11 = d70.c.g(limitCents2.getMax());
                                        if (c11 != null) {
                                        }
                                        Pair pair2222 = new Pair(name, str);
                                        linkedHashMap.put(pair2222.e(), pair2222.f());
                                    }
                                    c11 = null;
                                    if (c11 != null) {
                                    }
                                    Pair pair22222 = new Pair(name, str);
                                    linkedHashMap.put(pair22222.e(), pair22222.f());
                                    break;
                                case 4:
                                    if (transferData != null && (commissions = transferData.getCommissions()) != null) {
                                        c11 = d70.c.g(commissions.getSenderCommonAmountCents());
                                        if (c11 != null) {
                                        }
                                        Pair pair222222 = new Pair(name, str);
                                        linkedHashMap.put(pair222222.e(), pair222222.f());
                                    }
                                    c11 = null;
                                    if (c11 != null) {
                                    }
                                    Pair pair2222222 = new Pair(name, str);
                                    linkedHashMap.put(pair2222222.e(), pair2222222.f());
                                    break;
                                case 5:
                                    if (transferData != null && (commissions2 = transferData.getCommissions()) != null) {
                                        c11 = d70.c.g(commissions2.getReceiverCommonAmountCents());
                                        if (c11 != null) {
                                        }
                                        Pair pair22222222 = new Pair(name, str);
                                        linkedHashMap.put(pair22222222.e(), pair22222222.f());
                                    }
                                    c11 = null;
                                    if (c11 != null) {
                                    }
                                    Pair pair222222222 = new Pair(name, str);
                                    linkedHashMap.put(pair222222222.e(), pair222222222.f());
                                    break;
                                case 6:
                                    if (transferData != null && (commissions3 = transferData.getCommissions()) != null) {
                                        c11 = d70.c.g(commissions3.getSenderCommonAmountCents());
                                        if (c11 != null) {
                                        }
                                        Pair pair2222222222 = new Pair(name, str);
                                        linkedHashMap.put(pair2222222222.e(), pair2222222222.f());
                                    }
                                    c11 = null;
                                    if (c11 != null) {
                                    }
                                    Pair pair22222222222 = new Pair(name, str);
                                    linkedHashMap.put(pair22222222222.e(), pair22222222222.f());
                                    break;
                                case 7:
                                    if (transferData != null && (commissions4 = transferData.getCommissions()) != null) {
                                        c11 = d70.c.g(commissions4.getSenderPriviligedAmountCents());
                                        if (c11 != null) {
                                        }
                                        Pair pair222222222222 = new Pair(name, str);
                                        linkedHashMap.put(pair222222222222.e(), pair222222222222.f());
                                    }
                                    c11 = null;
                                    if (c11 != null) {
                                    }
                                    Pair pair2222222222222 = new Pair(name, str);
                                    linkedHashMap.put(pair2222222222222.e(), pair2222222222222.f());
                                    break;
                                case 8:
                                case 9:
                                    c11 = "";
                                    if (c11 != null) {
                                    }
                                    Pair pair22222222222222 = new Pair(name, str);
                                    linkedHashMap.put(pair22222222222222.e(), pair22222222222222.f());
                                    break;
                                default:
                                    throw new o();
                            }
                        }
                        return linkedHashMap;
                    }
                    return null;
                }
                d11 = cVar2.f28360e;
                bVar = cVar2.f28359d;
                s.b(obj);
                interfaceC6317d = (InterfaceC6317d) obj;
                if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                    if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
                        throw new o();
                    }
                    MainData mainData2 = (MainData) ((InterfaceC6317d.b) interfaceC6317d).a();
                    W60.a aVar3 = W60.a.TRANSFER;
                    Y60.b<TransferData> bVar3 = bVar.f28355e;
                    cVar2.f28359d = bVar;
                    cVar2.f28360e = d11;
                    cVar2.f28361f = mainData2;
                    cVar2.f28364i = 2;
                    Object s11 = bVar.s(aVar3, bVar3, cVar2);
                    if (s11 != aVar) {
                        list = d11;
                        mainData = mainData2;
                        obj = s11;
                        bVar2 = bVar;
                        interfaceC6317d2 = (InterfaceC6317d) obj;
                        if (!(interfaceC6317d2 instanceof InterfaceC6317d.a)) {
                        }
                    }
                    return aVar;
                }
                return null;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f28362g;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f28364i;
        if (i11 != 0) {
        }
        interfaceC6317d = (InterfaceC6317d) obj2;
        if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
        }
        return null;
    }

    @Override // V60.a
    public final Object i(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Unit k11 = this.f28352b.k();
        return k11 == Wc.a.COROUTINE_SUSPENDED ? k11 : Unit.f71690a;
    }

    @Override // V60.a
    public final Object j(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return s(W60.a.TRANSFER, this.f28355e, cVar);
    }

    @Override // V60.a
    public final Object k(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return r(new i(1, this.f28351a, InterfaceC4958a.class, "getTransferDataFromNetwork", "getTransferDataFromNetwork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), W60.a.TRANSFER, this.f28355e, cVar);
    }

    @Override // V60.a
    public final Object l(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return r(new h(1, this.f28351a, InterfaceC4958a.class, "getMainDataFromNetwork", "getMainDataFromNetwork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), W60.a.MAIN, this.f28354d, cVar);
    }

    @Override // V60.a
    public final boolean m() {
        Iterator<E> it = W60.a.a().iterator();
        while (it.hasNext()) {
            if (!e((W60.a) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // V60.a
    public final Object n(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return s(W60.a.MAIN, this.f28354d, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r2.f(r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r2.k(r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // V60.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        b bVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f28383g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f28383g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f28381e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f28383g;
                if (i11 != 0) {
                    s.b(obj);
                    fVar.f28380d = this;
                    fVar.f28383g = 1;
                    if (l(fVar) != aVar) {
                        bVar = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    bVar = fVar.f28380d;
                    s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return new InterfaceC6317d.b(Unit.f71690a);
                    }
                    bVar = fVar.f28380d;
                    s.b(obj);
                    fVar.f28380d = null;
                    fVar.f28383g = 3;
                }
                fVar.f28380d = bVar;
                fVar.f28383g = 2;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f28381e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f28383g;
        if (i11 != 0) {
        }
        fVar.f28380d = bVar;
        fVar.f28383g = 2;
    }
}
