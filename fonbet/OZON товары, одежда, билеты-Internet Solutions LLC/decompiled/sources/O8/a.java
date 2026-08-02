package O8;

import P8.b;
import Q8.c;
import Q8.g;
import Q8.h;
import Q8.i;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final a f20056d = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f20057a;

    /* renamed from: b, reason: collision with root package name */
    private final P8.a f20058b;

    /* renamed from: c, reason: collision with root package name */
    private final h f20059c;

    private a() {
        b bVar = new b();
        this.f20057a = bVar;
        P8.a aVar = new P8.a();
        this.f20058b = aVar;
        h hVar = new h("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto");
        this.f20059c = hVar;
        new g(hVar, aVar, bVar);
        new h("/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto");
        new i(aVar, bVar);
        new h("/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto");
        new c(aVar, bVar);
    }

    public static a a() {
        return f20056d;
    }

    public final P8.a b() {
        return this.f20058b;
    }

    public final b c() {
        return this.f20057a;
    }

    public final h d() {
        return this.f20059c;
    }
}
