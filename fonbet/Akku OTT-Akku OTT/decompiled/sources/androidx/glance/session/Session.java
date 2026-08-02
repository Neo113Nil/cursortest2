package androidx.glance.session;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.glance.EmittableWithChildren;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.g;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.channels.j;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0001H\u0084@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/glance/session/Session;", "", "", Constants.KEY, "<init>", "(Ljava/lang/String;)V", "Landroidx/glance/EmittableWithChildren;", "createRootEmittable", "()Landroidx/glance/EmittableWithChildren;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/glance/GlanceComposable;", "provideGlance", "(Landroid/content/Context;)Lkotlin/jvm/functions/Function2;", "root", "", "processEmittableTree", "(Landroid/content/Context;Landroidx/glance/EmittableWithChildren;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", NotificationCompat.CATEGORY_EVENT, "processEvent", "(Landroid/content/Context;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "receiveEvents", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lkotlinx/coroutines/channels/g;", "eventChannel", "Lkotlinx/coroutines/channels/g;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class Session {
    public static final int $stable = 8;
    private final g<Object> eventChannel = j.a(Integer.MAX_VALUE, null, 6);
    private final String key;

    public Session(String str) {
        this.key = str;
    }

    public final void close() {
        this.eventChannel.g(null);
    }

    public abstract EmittableWithChildren createRootEmittable();

    public final String getKey() {
        return this.key;
    }

    public abstract Object processEmittableTree(Context context, EmittableWithChildren emittableWithChildren, Continuation<? super Boolean> continuation);

    public abstract Object processEvent(Context context, Object obj, Continuation<? super Unit> continuation);

    /* renamed from: provideGlance */
    public abstract Function2<Composer, Integer, Unit> mo1282provideGlance(Context context);

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(5:19|20|(1:22)|24|25))(2:27|28))(6:29|30|20|(0)|24|25))(4:31|32|14|(0)(0))))|34|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r5.processEvent(r2, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[Catch: o -> 0x009b, TRY_LEAVE, TryCatch #0 {o -> 0x009b, blocks: (B:12:0x0038, B:14:0x0065, B:20:0x007b, B:22:0x0083, B:30:0x0057, B:32:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0098 -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object receiveEvents(Context context, Function1<Object, Unit> function1, Continuation<? super Unit> continuation) {
        Session$receiveEvents$1 session$receiveEvents$1;
        int i;
        i<Object> it;
        Session session;
        i<Object> iVar;
        Session session2;
        Context context2;
        Object b;
        if (continuation instanceof Session$receiveEvents$1) {
            session$receiveEvents$1 = (Session$receiveEvents$1) continuation;
            int i2 = session$receiveEvents$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                session$receiveEvents$1.label = i2 - Integer.MIN_VALUE;
                Object obj = session$receiveEvents$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = session$receiveEvents$1.label;
                if (i == 0) {
                    if (i == 1) {
                        iVar = (i) session$receiveEvents$1.L$3;
                        function1 = (Function1) session$receiveEvents$1.L$2;
                        context2 = (Context) session$receiveEvents$1.L$1;
                        session2 = (Session) session$receiveEvents$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = (i) session$receiveEvents$1.L$3;
                    function1 = (Function1) session$receiveEvents$1.L$2;
                    context2 = (Context) session$receiveEvents$1.L$1;
                    session2 = (Session) session$receiveEvents$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    it = iVar;
                    context = context2;
                    session = session2;
                    session$receiveEvents$1.L$0 = session;
                    session$receiveEvents$1.L$1 = context;
                    session$receiveEvents$1.L$2 = function1;
                    session$receiveEvents$1.L$3 = it;
                    session$receiveEvents$1.label = 1;
                    b = it.b(session$receiveEvents$1);
                    if (b != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Session session3 = session;
                    context2 = context;
                    iVar = it;
                    obj = b;
                    session2 = session3;
                    if (((Boolean) obj).booleanValue()) {
                        Object next = iVar.next();
                        function1.invoke(next);
                        session$receiveEvents$1.L$0 = session2;
                        session$receiveEvents$1.L$1 = context2;
                        session$receiveEvents$1.L$2 = function1;
                        session$receiveEvents$1.L$3 = iVar;
                        session$receiveEvents$1.label = 2;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                it = this.eventChannel.iterator();
                session = this;
                session$receiveEvents$1.L$0 = session;
                session$receiveEvents$1.L$1 = context;
                session$receiveEvents$1.L$2 = function1;
                session$receiveEvents$1.L$3 = it;
                session$receiveEvents$1.label = 1;
                b = it.b(session$receiveEvents$1);
                if (b != coroutine_suspended) {
                }
            }
        }
        session$receiveEvents$1 = new Session$receiveEvents$1(this, continuation);
        Object obj2 = session$receiveEvents$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = session$receiveEvents$1.label;
        if (i == 0) {
        }
    }

    public final Object sendEvent(Object obj, Continuation<? super Unit> continuation) {
        Object i = this.eventChannel.i(obj, continuation);
        return i == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i : Unit.INSTANCE;
    }
}
