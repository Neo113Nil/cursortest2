package B;

import java.util.Map;

/* loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f625l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y.f f626m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(Y.f fVar, int i) {
        super(1);
        this.f625l = i;
        this.f626m = fVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f625l) {
            case 0:
                Y.f fVar = this.f626m;
                return Boolean.valueOf(fVar != null ? fVar.c(obj) : true);
            default:
                return new J(this.f626m, (Map) obj);
        }
    }
}
