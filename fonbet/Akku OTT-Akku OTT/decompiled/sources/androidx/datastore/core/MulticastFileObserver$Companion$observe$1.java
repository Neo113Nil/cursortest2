package androidx.datastore.core;

import androidx.datastore.core.MulticastFileObserver;
import androidx.media3.container.MdtaMetadataEntry;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.InterfaceC1053e0;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.channels.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/t;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/t;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", i = {0, 0}, l = {MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64, 79}, m = "invokeSuspend", n = {"$this$channelFlow", "disposeListener"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
public final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements Function2<t<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, Continuation<? super MulticastFileObserver$Companion$observe$1> continuation) {
        super(2, continuation);
        this.$file = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(File file, t tVar, String str) {
        if (Intrinsics.areEqual(str, file.getName())) {
            Unit unit = Unit.INSTANCE;
            Object c = tVar.c(unit);
            if (c instanceof k.c) {
                Object obj = ((kotlinx.coroutines.channels.k) C1082i.d(EmptyCoroutineContext.INSTANCE, new kotlinx.coroutines.channels.n(tVar, unit, null))).a;
            } else {
                kotlinx.coroutines.channels.k.Companion.getClass();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(InterfaceC1053e0 interfaceC1053e0) {
        interfaceC1053e0.dispose();
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, continuation);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (kotlinx.coroutines.channels.r.a(r3, r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final InterfaceC1053e0 observe;
        t tVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final t tVar2 = (t) this.L$0;
            final File file = this.$file;
            Function1 function1 = new Function1() { // from class: androidx.datastore.core.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = MulticastFileObserver$Companion$observe$1.invokeSuspend$lambda$0(file, tVar2, (String) obj2);
                    return invokeSuspend$lambda$0;
                }
            };
            MulticastFileObserver.Companion companion = MulticastFileObserver.INSTANCE;
            File parentFile = file.getParentFile();
            Intrinsics.checkNotNull(parentFile);
            observe = companion.observe(parentFile, function1);
            Unit unit = Unit.INSTANCE;
            this.L$0 = tVar2;
            this.L$1 = observe;
            this.label = 1;
            if (tVar2.i(unit, this) != coroutine_suspended) {
                tVar = tVar2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        observe = (InterfaceC1053e0) this.L$1;
        tVar = (t) this.L$0;
        ResultKt.throwOnFailure(obj);
        Function0 function0 = new Function0() { // from class: androidx.datastore.core.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invokeSuspend$lambda$1;
                invokeSuspend$lambda$1 = MulticastFileObserver$Companion$observe$1.invokeSuspend$lambda$1(InterfaceC1053e0.this);
                return invokeSuspend$lambda$1;
            }
        };
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(t<? super Unit> tVar, Continuation<? super Unit> continuation) {
        return ((MulticastFileObserver$Companion$observe$1) create(tVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
