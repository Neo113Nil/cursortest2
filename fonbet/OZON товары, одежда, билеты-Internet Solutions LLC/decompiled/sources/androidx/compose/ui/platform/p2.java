package androidx.compose.ui.platform;

import Ae.InterfaceC2397i;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {117, 123}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class p2 extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super Float>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    ze.j f40985d;

    /* renamed from: e, reason: collision with root package name */
    int f40986e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f40987f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ContentResolver f40988g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Uri f40989h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ q2 f40990i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C11115c f40991j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Context f40992k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p2(ContentResolver contentResolver, Uri uri, q2 q2Var, C11115c c11115c, Context context, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f40988g = contentResolver;
        this.f40989h = uri;
        this.f40990i = q2Var;
        this.f40991j = c11115c;
        this.f40992k = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C11115c c11115c = this.f40991j;
        p2 p2Var = new p2(this.f40988g, this.f40989h, this.f40990i, c11115c, this.f40992k, dVar);
        p2Var.f40987f = obj;
        return p2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super Float> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((p2) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r6.emit(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:9:0x0042, B:15:0x0052, B:17:0x005a, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007a -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC2397i interfaceC2397i;
        ze.j it;
        InterfaceC2397i interfaceC2397i2;
        Object b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40986e;
        q2 q2Var = this.f40990i;
        ContentResolver contentResolver = this.f40988g;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC2397i = (InterfaceC2397i) this.f40987f;
                contentResolver.registerContentObserver(this.f40989h, false, q2Var);
                it = this.f40991j.iterator();
                this.f40987f = interfaceC2397i;
                this.f40985d = it;
                this.f40986e = 1;
                b11 = it.b(this);
                if (b11 != aVar) {
                }
            } else if (i11 == 1) {
                it = this.f40985d;
                interfaceC2397i2 = (InterfaceC2397i) this.f40987f;
                Sc.s.b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f40985d;
                interfaceC2397i2 = (InterfaceC2397i) this.f40987f;
                Sc.s.b(obj);
                interfaceC2397i = interfaceC2397i2;
                this.f40987f = interfaceC2397i;
                this.f40985d = it;
                this.f40986e = 1;
                b11 = it.b(this);
                if (b11 != aVar) {
                    return aVar;
                }
                interfaceC2397i2 = interfaceC2397i;
                obj = b11;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(q2Var);
                    return Unit.f71690a;
                }
                it.next();
                Float f7 = new Float(Settings.Global.getFloat(this.f40992k.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f40987f = interfaceC2397i2;
                this.f40985d = it;
                this.f40986e = 2;
            }
        } catch (Throwable th2) {
            contentResolver.unregisterContentObserver(q2Var);
            throw th2;
        }
    }
}
