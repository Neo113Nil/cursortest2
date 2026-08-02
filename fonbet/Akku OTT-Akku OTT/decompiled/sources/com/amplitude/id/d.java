package com.amplitude.id;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public final String a;
    public final String b;
    public final b c;
    public final File d;
    public final String e;
    public final com.amplitude.common.a f;

    public d(String instanceName, String str, b identityStorageProvider, File storageDirectory, String fileName, com.amplitude.common.a aVar) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Intrinsics.checkNotNullParameter(identityStorageProvider, "identityStorageProvider");
        Intrinsics.checkNotNullParameter(storageDirectory, "storageDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.a = instanceName;
        this.b = str;
        this.c = identityStorageProvider;
        this.d = storageDirectory;
        this.e = fileName;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.c, dVar.c) && Intrinsics.areEqual(this.d, dVar.d) && Intrinsics.areEqual(this.e, dVar.e) && Intrinsics.areEqual(this.f, dVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int a = androidx.compose.runtime.collection.a.a((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 961)) * 31)) * 31, 31, this.e);
        com.amplitude.common.a aVar = this.f;
        return a + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "IdentityConfiguration(instanceName=" + this.a + ", apiKey=" + this.b + ", experimentApiKey=null, identityStorageProvider=" + this.c + ", storageDirectory=" + this.d + ", fileName=" + this.e + ", logger=" + this.f + ')';
    }
}
