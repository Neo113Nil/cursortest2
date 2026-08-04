package T4;

import Y3.i;
import java.util.Collections;
import java.util.Map;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6348m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(C1017n0 c1017n0, i iVar, int i7) {
        super(c1017n0, iVar);
        this.f6348m = i7;
    }

    @Override // T4.c
    public final String d() {
        switch (this.f6348m) {
            case 0:
                return "DELETE";
            case 1:
                return "GET";
            default:
                return "GET";
        }
    }

    @Override // T4.c
    public Map h() {
        switch (this.f6348m) {
            case 2:
                return Collections.singletonMap("alt", "media");
            default:
                return super.h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1017n0 c1017n0, i iVar, long j) {
        super(c1017n0, iVar);
        this.f6348m = 2;
        if (j != 0) {
            q("Range", "bytes=" + j + "-");
        }
    }
}
