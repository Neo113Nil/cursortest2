package Fh0;

import androidx.collection.C5153w;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9485b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f9484a = i11;
        this.f9485b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9484a) {
            case 0:
                return k.d((k) this.f9485b, (C5153w) obj);
            default:
                return R80.g.b((R80.g) this.f9485b, (R80.b) obj);
        }
    }
}
