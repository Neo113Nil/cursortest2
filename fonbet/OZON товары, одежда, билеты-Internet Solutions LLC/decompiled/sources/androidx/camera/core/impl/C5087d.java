package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;

/* renamed from: androidx.camera.core.impl.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5087d<T> extends T.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f38275a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f38276b;

    /* renamed from: c, reason: collision with root package name */
    private final CaptureRequest.Key f38277c;

    C5087d(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f38275a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f38276b = cls;
        this.f38277c = key;
    }

    @Override // androidx.camera.core.impl.T.a
    @NonNull
    public final String c() {
        return this.f38275a;
    }

    @Override // androidx.camera.core.impl.T.a
    public final Object d() {
        return this.f38277c;
    }

    @Override // androidx.camera.core.impl.T.a
    @NonNull
    public final Class<T> e() {
        return this.f38276b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T.a)) {
            return false;
        }
        T.a aVar = (T.a) obj;
        if (!this.f38275a.equals(aVar.c()) || !this.f38276b.equals(aVar.e())) {
            return false;
        }
        CaptureRequest.Key key = this.f38277c;
        return key == null ? aVar.d() == null : key.equals(aVar.d());
    }

    public final int hashCode() {
        int hashCode = (((this.f38275a.hashCode() ^ 1000003) * 1000003) ^ this.f38276b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.f38277c;
        return hashCode ^ (key == null ? 0 : key.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f38275a + ", valueClass=" + this.f38276b + ", token=" + this.f38277c + "}";
    }
}
