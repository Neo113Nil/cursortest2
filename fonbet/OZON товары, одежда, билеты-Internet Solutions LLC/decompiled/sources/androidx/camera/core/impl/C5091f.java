package androidx.camera.core.impl;

import B90.C2618u;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import java.util.List;

/* renamed from: androidx.camera.core.impl.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5091f extends InterfaceC5086c0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f38287a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38288b;

    /* renamed from: c, reason: collision with root package name */
    private final List<InterfaceC5086c0.a> f38289c;

    /* renamed from: d, reason: collision with root package name */
    private final List<InterfaceC5086c0.c> f38290d;

    C5091f(int i11, int i12, List<InterfaceC5086c0.a> list, List<InterfaceC5086c0.c> list2) {
        this.f38287a = i11;
        this.f38288b = i12;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f38289c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f38290d = list2;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0
    public final int a() {
        return this.f38288b;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0
    @NonNull
    public final List<InterfaceC5086c0.a> b() {
        return this.f38289c;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0
    public final int c() {
        return this.f38287a;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0
    @NonNull
    public final List<InterfaceC5086c0.c> d() {
        return this.f38290d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC5086c0.b) {
            InterfaceC5086c0.b bVar = (InterfaceC5086c0.b) obj;
            if (this.f38287a == ((C5091f) bVar).f38287a) {
                C5091f c5091f = (C5091f) bVar;
                if (this.f38288b == c5091f.f38288b && this.f38289c.equals(c5091f.f38289c) && this.f38290d.equals(c5091f.f38290d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f38287a ^ 1000003) * 1000003) ^ this.f38288b) * 1000003) ^ this.f38289c.hashCode()) * 1000003) ^ this.f38290d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb2.append(this.f38287a);
        sb2.append(", recommendedFileFormat=");
        sb2.append(this.f38288b);
        sb2.append(", audioProfiles=");
        sb2.append(this.f38289c);
        sb2.append(", videoProfiles=");
        return C2618u.h(sb2, this.f38290d, "}");
    }
}
