package p028d6;

import U5.AbstractC0438e;
import U5.N;
import U5.O;
import U5.e0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12497a = 0;

    @Override // U5.O
    public String a() {
        return "round_robin";
    }

    @Override // U5.O
    public int b() {
        return 5;
    }

    @Override // U5.O
    public boolean c() {
        return true;
    }

    @Override // U5.O
    public final N d(AbstractC0438e abstractC0438e) {
        return new x(abstractC0438e);
    }

    @Override // U5.O
    public e0 e(Map map) {
        return new e0("no service config");
    }
}
