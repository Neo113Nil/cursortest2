package Id0;

import De.C2862e;
import Sc.s;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

/* loaded from: classes7.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fd0.c f12262a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f12263b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.inapp.push.sdk.internal.presentation.NotificationBarSdkListenerImpl$onDismiss$1", f = "NotificationBarSdkListener.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12264d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Gd0.a f12266f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ NotificationBar.DismissReason f12267g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Gd0.a aVar, NotificationBar.DismissReason dismissReason, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f12266f = aVar;
            this.f12267g = dismissReason;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new a(this.f12266f, this.f12267g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12264d;
            if (i11 == 0) {
                s.b(obj);
                Fd0.c cVar = f.this.f12262a;
                String b11 = this.f12266f.b();
                if (b11 == null) {
                    return Unit.f71690a;
                }
                this.f12264d = 1;
                if (cVar.a(b11, this.f12267g, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.inapp.push.sdk.internal.presentation.NotificationBarSdkListenerImpl$onShow$1", f = "NotificationBarSdkListener.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12268d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Gd0.a f12270f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Gd0.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f12270f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new b(this.f12270f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12268d;
            if (i11 == 0) {
                s.b(obj);
                Fd0.c cVar = f.this.f12262a;
                String b11 = this.f12270f.b();
                if (b11 == null) {
                    return Unit.f71690a;
                }
                this.f12268d = 1;
                if (cVar.a(b11, null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public f(@NotNull Fd0.c inAppPushInteractor) {
        Intrinsics.checkNotNullParameter(inAppPushInteractor, "inAppPushInteractor");
        this.f12262a = inAppPushInteractor;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f12263b = N.a(CoroutineContext.Element.a.d(He.b.f10879b, (H0) b11));
    }

    @Override // Id0.e
    public final void a(@NotNull NotificationBar.DismissReason dismissReason, @NotNull Gd0.a inAppPushEntity) {
        Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
        Intrinsics.checkNotNullParameter(inAppPushEntity, "inAppPushEntity");
        C10727i.c(this.f12263b, null, null, new a(inAppPushEntity, dismissReason, null), 3);
    }

    @Override // Id0.e
    public final void b(@NotNull Gd0.a inAppPushEntity) {
        Intrinsics.checkNotNullParameter(inAppPushEntity, "inAppPushEntity");
        C10727i.c(this.f12263b, null, null, new b(inAppPushEntity, null), 3);
    }
}
