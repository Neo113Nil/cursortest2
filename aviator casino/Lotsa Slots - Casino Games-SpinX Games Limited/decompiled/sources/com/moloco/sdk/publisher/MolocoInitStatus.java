package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoInitStatus;", "", com.unity3d.ads.core.data.model.exception.GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, "Lcom/moloco/sdk/publisher/Initialization;", "description", "", "<init>", "(Lcom/moloco/sdk/publisher/Initialization;Ljava/lang/String;)V", "getInitialization", "()Lcom/moloco/sdk/publisher/Initialization;", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MolocoInitStatus {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final com.moloco.sdk.publisher.Initialization initialization;

    public MolocoInitStatus(com.moloco.sdk.publisher.Initialization initialization, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialization, "initialization");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        this.initialization = initialization;
        this.description = description;
    }

    public static /* synthetic */ com.moloco.sdk.publisher.MolocoInitStatus copy$default(com.moloco.sdk.publisher.MolocoInitStatus molocoInitStatus, com.moloco.sdk.publisher.Initialization initialization, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            initialization = molocoInitStatus.initialization;
        }
        if ((i & 2) != 0) {
            str = molocoInitStatus.description;
        }
        return molocoInitStatus.copy(initialization, str);
    }

    /* renamed from: component1, reason: from getter */
    public final com.moloco.sdk.publisher.Initialization getInitialization() {
        return this.initialization;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.moloco.sdk.publisher.MolocoInitStatus copy(com.moloco.sdk.publisher.Initialization initialization, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialization, "initialization");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        return new com.moloco.sdk.publisher.MolocoInitStatus(initialization, description);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.moloco.sdk.publisher.MolocoInitStatus)) {
            return false;
        }
        com.moloco.sdk.publisher.MolocoInitStatus molocoInitStatus = (com.moloco.sdk.publisher.MolocoInitStatus) other;
        return this.initialization == molocoInitStatus.initialization && kotlin.jvm.internal.Intrinsics.areEqual(this.description, molocoInitStatus.description);
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.moloco.sdk.publisher.Initialization getInitialization() {
        return this.initialization;
    }

    public int hashCode() {
        return (this.initialization.hashCode() * 31) + this.description.hashCode();
    }

    public java.lang.String toString() {
        return "MolocoInitStatus(initialization=" + this.initialization + ", description=" + this.description + ')';
    }
}
