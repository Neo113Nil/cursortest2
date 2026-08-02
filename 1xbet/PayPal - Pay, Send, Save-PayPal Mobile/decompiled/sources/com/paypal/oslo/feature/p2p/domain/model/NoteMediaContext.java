package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/NoteMediaContext;", "", "", "id", "Lcom/paypal/oslo/feature/p2p/domain/model/NoteMediaProvider;", "provider", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/NoteMediaProvider;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/NoteMediaProvider;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/NoteMediaProvider;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/NoteMediaContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/p2p/domain/model/NoteMediaProvider;", "getProvider", "getContentType", "getReferenceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NoteMediaContext {
    public static final int $stable = 0;
    private final java.lang.String contentType;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.p2p.domain.model.NoteMediaProvider provider;
    private final java.lang.String referenceUrl;

    public NoteMediaContext(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.NoteMediaProvider noteMediaProvider, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noteMediaProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.provider = noteMediaProvider;
        this.contentType = str2;
        this.referenceUrl = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.NoteMediaProvider getProvider() {
        return this.provider;
    }

    public final java.lang.String getContentType() {
        return this.contentType;
    }

    public final java.lang.String getReferenceUrl() {
        return this.referenceUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.p2p.domain.model.NoteMediaProvider noteMediaProvider = this.provider;
        java.lang.String str2 = this.contentType;
        java.lang.String str3 = this.referenceUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NoteMediaContext(id=");
        sb.append(str);
        sb.append(", provider=");
        sb.append(noteMediaProvider);
        sb.append(", contentType=");
        sb.append(str2);
        sb.append(", referenceUrl=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.provider.hashCode();
        int hashCode3 = this.contentType.hashCode();
        java.lang.String str = this.referenceUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.NoteMediaContext)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.NoteMediaContext noteMediaContext = (com.paypal.oslo.feature.p2p.domain.model.NoteMediaContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, noteMediaContext.id) && this.provider == noteMediaContext.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, noteMediaContext.contentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, noteMediaContext.referenceUrl);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.NoteMediaContext copy(java.lang.String id, com.paypal.oslo.feature.p2p.domain.model.NoteMediaProvider provider, java.lang.String contentType, java.lang.String referenceUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        return new com.paypal.oslo.feature.p2p.domain.model.NoteMediaContext(id, provider, contentType, referenceUrl);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getReferenceUrl() {
        return this.referenceUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.NoteMediaProvider getProvider() {
        return this.provider;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.NoteMediaContext copy$default(com.paypal.oslo.feature.p2p.domain.model.NoteMediaContext noteMediaContext, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.NoteMediaProvider noteMediaProvider, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = noteMediaContext.id;
        }
        if ((i & 2) != 0) {
            noteMediaProvider = noteMediaContext.provider;
        }
        if ((i & 4) != 0) {
            str2 = noteMediaContext.contentType;
        }
        if ((i & 8) != 0) {
            str3 = noteMediaContext.referenceUrl;
        }
        return noteMediaContext.copy(str, noteMediaProvider, str2, str3);
    }
}
