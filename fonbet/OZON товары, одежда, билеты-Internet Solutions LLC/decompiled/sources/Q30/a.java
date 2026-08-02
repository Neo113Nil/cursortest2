package Q30;

import P30.c;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements Y30.a<P30.b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f22947a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final O30.b f22948b;

    public a(@NotNull Application application, @NotNull O30.b type) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f22947a = application;
        this.f22948b = type;
    }

    @Override // Y30.a
    public final P30.b create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        c.a a11 = P30.a.a();
        a11.a(this.f22947a);
        a11.b(this.f22948b);
        return a11.create();
    }
}
