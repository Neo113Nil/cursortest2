package Hj0;

import com.squareup.moshi.Moshi;
import j10.InterfaceC7238a;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes7.dex */
public final class y implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11202a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11203b;

    public /* synthetic */ y(Object obj, Pc.a aVar, int i11) {
        this.f11202a = i11;
        this.f11203b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11202a) {
            case 0:
                Moshi moshi = (Moshi) this.f11203b.get();
                Intrinsics.checkNotNullParameter(moshi, "moshi");
                MoshiConverterFactory create = MoshiConverterFactory.create(moshi);
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Jb.j.d(create);
                return create;
            default:
                QZ.a composer = (QZ.a) this.f11203b.get();
                Intrinsics.checkNotNullParameter(composer, "composer");
                InterfaceC7238a r11 = composer.r();
                Jb.j.d(r11);
                return r11;
        }
    }
}
