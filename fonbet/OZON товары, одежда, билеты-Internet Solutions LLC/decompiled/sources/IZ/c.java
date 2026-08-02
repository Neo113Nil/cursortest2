package IZ;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class c implements a {
    private final KZ.a deeplinkInterceptor;
    private final KZ.b destinationInterceptor;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final KZ.a getDeeplinkInterceptor() {
        return this.deeplinkInterceptor;
    }

    public final KZ.b getDestinationInterceptor() {
        return this.destinationInterceptor;
    }

    public c(KZ.b bVar, KZ.a aVar) {
        this.destinationInterceptor = bVar;
        this.deeplinkInterceptor = aVar;
    }

    public /* synthetic */ c(KZ.b bVar, KZ.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? null : aVar);
    }
}
