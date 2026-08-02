package com.paypal.oslo.feature.notificationcenter.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/Section;", "Landroid/os/Parcelable;", "", "tag", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/domain/model/Section;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTag", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Section implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.notificationcenter.domain.model.Section> CREATOR = new com.paypal.oslo.feature.notificationcenter.domain.model.Section.Creator();
    private final java.lang.String tag;
    private final java.lang.String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Section(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.tag = str;
        this.title = str2;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.tag);
        dest.writeString(this.title);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.tag;
        java.lang.String str2 = this.title;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Section(tag=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.tag.hashCode() * 31) + this.title.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.notificationcenter.domain.model.Section)) {
            return false;
        }
        com.paypal.oslo.feature.notificationcenter.domain.model.Section section = (com.paypal.oslo.feature.notificationcenter.domain.model.Section) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tag, section.tag) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, section.title);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.notificationcenter.domain.model.Section> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.notificationcenter.domain.model.Section[] newArray(int i) {
            return new com.paypal.oslo.feature.notificationcenter.domain.model.Section[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.notificationcenter.domain.model.Section createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.notificationcenter.domain.model.Section(parcel.readString(), parcel.readString());
        }
    }

    public final com.paypal.oslo.feature.notificationcenter.domain.model.Section copy(java.lang.String tag, java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.notificationcenter.domain.model.Section(tag, title);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTag() {
        return this.tag;
    }

    public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.domain.model.Section copy$default(com.paypal.oslo.feature.notificationcenter.domain.model.Section section, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = section.tag;
        }
        if ((i & 2) != 0) {
            str2 = section.title;
        }
        return section.copy(str, str2);
    }
}
