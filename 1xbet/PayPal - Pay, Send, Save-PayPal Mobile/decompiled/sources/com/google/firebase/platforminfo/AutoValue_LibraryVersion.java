package com.google.firebase.platforminfo;

/* loaded from: classes.dex */
final class AutoValue_LibraryVersion extends com.google.firebase.platforminfo.LibraryVersion {
    private final java.lang.String libraryName;
    private final java.lang.String version;

    AutoValue_LibraryVersion(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null libraryName");
        }
        this.libraryName = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null version");
        }
        this.version = str2;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @javax.annotation.Nonnull
    public final java.lang.String getLibraryName() {
        return this.libraryName;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @javax.annotation.Nonnull
    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.libraryName);
        sb.append(", version=");
        sb.append(this.version);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.platforminfo.LibraryVersion)) {
            return false;
        }
        com.google.firebase.platforminfo.LibraryVersion libraryVersion = (com.google.firebase.platforminfo.LibraryVersion) obj;
        return this.libraryName.equals(libraryVersion.getLibraryName()) && this.version.equals(libraryVersion.getVersion());
    }

    public final int hashCode() {
        return ((this.libraryName.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode();
    }
}
