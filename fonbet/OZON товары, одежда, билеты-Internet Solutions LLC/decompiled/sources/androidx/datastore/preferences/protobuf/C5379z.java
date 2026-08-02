package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5379z extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private Q f42630a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42631b;

    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C5379z {
    }

    static C5379z b() {
        return new C5379z("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C5379z e() {
        return new C5379z("CodedInputStream encountered a malformed varint.");
    }

    static C5379z f() {
        return new C5379z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C5379z i() {
        return new C5379z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    final boolean a() {
        return this.f42631b;
    }

    final void g() {
        this.f42631b = true;
    }

    public final void h(Q q11) {
        this.f42630a = q11;
    }
}
