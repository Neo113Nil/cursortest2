package Ve;

import android.net.ConnectivityManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class R1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29813d = 0;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29814e;

    public /* synthetic */ R1(int i11, kotlin.coroutines.d dVar) {
        super(i11, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29813d) {
            case 0:
                R1 r12 = new R1(2, dVar);
                r12.f29814e = obj;
                return r12;
            default:
                return new R1((C4592rj) this.f29814e, dVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29813d) {
            case 0:
                R1 r12 = new R1(2, (kotlin.coroutines.d) obj2);
                r12.f29814e = (String) obj;
                return r12.invokeSuspend(Unit.f71690a);
            default:
                return new R1((C4592rj) this.f29814e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29813d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                String str = (String) this.f29814e;
                Pattern compile = Pattern.compile("(|^)\\d{5}");
                Intrinsics.checkNotNullExpressionValue(compile, "compile(\"(|^)\\\\d{$OTP_CODE_LENGTH}\")");
                Matcher matcher = compile.matcher(str);
                Intrinsics.checkNotNullExpressionValue(matcher, "pattern.matcher(it)");
                if (matcher.find()) {
                    return new L5(matcher.group(0));
                }
                return null;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                C4592rj c4592rj = (C4592rj) this.f29814e;
                if (c4592rj.f31980d != null) {
                    Object systemService = androidx.core.content.a.getSystemService(c4592rj.requireContext(), ConnectivityManager.class);
                    Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    C4417lh c4417lh = c4592rj.f31980d;
                    if (c4417lh == null) {
                        Intrinsics.n("networkCallback");
                        throw null;
                    }
                    connectivityManager.unregisterNetworkCallback(c4417lh);
                }
                return Unit.f71690a;
        }
    }

    public R1() {
        super(2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(C4592rj c4592rj, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29814e = c4592rj;
    }
}
