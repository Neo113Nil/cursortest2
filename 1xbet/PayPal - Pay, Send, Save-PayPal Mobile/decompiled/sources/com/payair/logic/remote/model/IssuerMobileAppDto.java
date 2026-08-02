package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/payair/logic/remote/model/IssuerMobileAppDto;", "", "Lcom/payair/logic/remote/model/IssuerMobileAppDto$ActivateWithIssuerMobileAppAndroidIntentDto;", "activateWithIssuerMobileAppAndroidIntent", "Lcom/payair/logic/remote/model/IssuerMobileAppDto$OpenIssuerMobileAppAndroidIntentDto;", "openIssuerMobileAppAndroidIntent", "<init>", "(Lcom/payair/logic/remote/model/IssuerMobileAppDto$ActivateWithIssuerMobileAppAndroidIntentDto;Lcom/payair/logic/remote/model/IssuerMobileAppDto$OpenIssuerMobileAppAndroidIntentDto;)V", "component1", "()Lcom/payair/logic/remote/model/IssuerMobileAppDto$ActivateWithIssuerMobileAppAndroidIntentDto;", "component2", "()Lcom/payair/logic/remote/model/IssuerMobileAppDto$OpenIssuerMobileAppAndroidIntentDto;", "copy", "(Lcom/payair/logic/remote/model/IssuerMobileAppDto$ActivateWithIssuerMobileAppAndroidIntentDto;Lcom/payair/logic/remote/model/IssuerMobileAppDto$OpenIssuerMobileAppAndroidIntentDto;)Lcom/payair/logic/remote/model/IssuerMobileAppDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/payair/logic/remote/model/IssuerMobileAppDto$ActivateWithIssuerMobileAppAndroidIntentDto;", "getActivateWithIssuerMobileAppAndroidIntent", "Lcom/payair/logic/remote/model/IssuerMobileAppDto$OpenIssuerMobileAppAndroidIntentDto;", "getOpenIssuerMobileAppAndroidIntent", "ActivateWithIssuerMobileAppAndroidIntentDto", "OpenIssuerMobileAppAndroidIntentDto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IssuerMobileAppDto {
    private final com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto activateWithIssuerMobileAppAndroidIntent;
    private final com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto openIssuerMobileAppAndroidIntent;

    public IssuerMobileAppDto(com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto activateWithIssuerMobileAppAndroidIntentDto, com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto openIssuerMobileAppAndroidIntentDto) {
        this.activateWithIssuerMobileAppAndroidIntent = activateWithIssuerMobileAppAndroidIntentDto;
        this.openIssuerMobileAppAndroidIntent = openIssuerMobileAppAndroidIntentDto;
    }

    public final com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto getActivateWithIssuerMobileAppAndroidIntent() {
        return this.activateWithIssuerMobileAppAndroidIntent;
    }

    public final com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto getOpenIssuerMobileAppAndroidIntent() {
        return this.openIssuerMobileAppAndroidIntent;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/payair/logic/remote/model/IssuerMobileAppDto$ActivateWithIssuerMobileAppAndroidIntentDto;", "", "", "action", com.visa.cbp.ConsumerInfo.setSignature, "Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$MobileAppActivationParametersDto;", "mobileAppActivationParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$MobileAppActivationParametersDto;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$MobileAppActivationParametersDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$MobileAppActivationParametersDto;)Lcom/payair/logic/remote/model/IssuerMobileAppDto$ActivateWithIssuerMobileAppAndroidIntentDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAction", "Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$MobileAppActivationParametersDto;", "getMobileAppActivationParameters", "getPackageName"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActivateWithIssuerMobileAppAndroidIntentDto {
        private final java.lang.String action;
        private final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto mobileAppActivationParameters;
        private final java.lang.String packageName;

        public ActivateWithIssuerMobileAppAndroidIntentDto(java.lang.String str, java.lang.String str2, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto mobileAppActivationParametersDto) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileAppActivationParametersDto, "");
            this.action = str;
            this.packageName = str2;
            this.mobileAppActivationParameters = mobileAppActivationParametersDto;
        }

        public final java.lang.String getAction() {
            return this.action;
        }

        public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto getMobileAppActivationParameters() {
            return this.mobileAppActivationParameters;
        }

        public final java.lang.String getPackageName() {
            return this.packageName;
        }

        public final int hashCode() {
            return this.mobileAppActivationParameters.hashCode() + com.payair.csdk.w3.a(this.packageName, this.action.hashCode() * 31, 31);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.action;
            java.lang.String str2 = this.packageName;
            com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto mobileAppActivationParametersDto = this.mobileAppActivationParameters;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivateWithIssuerMobileAppAndroidIntentDto(action=");
            sb.append(str);
            sb.append(", packageName=");
            sb.append(str2);
            sb.append(", mobileAppActivationParameters=");
            sb.append(mobileAppActivationParametersDto);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto)) {
                return false;
            }
            com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto activateWithIssuerMobileAppAndroidIntentDto = (com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.action, activateWithIssuerMobileAppAndroidIntentDto.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageName, activateWithIssuerMobileAppAndroidIntentDto.packageName) && kotlin.jvm.internal.Intrinsics.areEqual(this.mobileAppActivationParameters, activateWithIssuerMobileAppAndroidIntentDto.mobileAppActivationParameters);
        }

        public final com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto copy(java.lang.String action, java.lang.String packageName, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto mobileAppActivationParameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileAppActivationParameters, "");
            return new com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto(action, packageName, mobileAppActivationParameters);
        }

        /* renamed from: component3, reason: from getter */
        public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto getMobileAppActivationParameters() {
            return this.mobileAppActivationParameters;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPackageName() {
            return this.packageName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        public static /* synthetic */ com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto copy$default(com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto activateWithIssuerMobileAppAndroidIntentDto, java.lang.String str, java.lang.String str2, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.MobileAppActivationParametersDto mobileAppActivationParametersDto, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activateWithIssuerMobileAppAndroidIntentDto.action;
            }
            if ((i & 2) != 0) {
                str2 = activateWithIssuerMobileAppAndroidIntentDto.packageName;
            }
            if ((i & 4) != 0) {
                mobileAppActivationParametersDto = activateWithIssuerMobileAppAndroidIntentDto.mobileAppActivationParameters;
            }
            return activateWithIssuerMobileAppAndroidIntentDto.copy(str, str2, mobileAppActivationParametersDto);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/payair/logic/remote/model/IssuerMobileAppDto$OpenIssuerMobileAppAndroidIntentDto;", "", "", "action", com.visa.cbp.ConsumerInfo.setSignature, "Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$OpenMobileAppParametersDto;", "openMobileAppParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$OpenMobileAppParametersDto;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$OpenMobileAppParametersDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$OpenMobileAppParametersDto;)Lcom/payair/logic/remote/model/IssuerMobileAppDto$OpenIssuerMobileAppAndroidIntentDto;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAction", "Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto$OpenMobileAppParametersDto;", "getOpenMobileAppParameters", "getPackageName"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenIssuerMobileAppAndroidIntentDto {
        private final java.lang.String action;
        private final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto openMobileAppParameters;
        private final java.lang.String packageName;

        public OpenIssuerMobileAppAndroidIntentDto(java.lang.String str, java.lang.String str2, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto openMobileAppParametersDto) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMobileAppParametersDto, "");
            this.action = str;
            this.packageName = str2;
            this.openMobileAppParameters = openMobileAppParametersDto;
        }

        public final java.lang.String getAction() {
            return this.action;
        }

        public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto getOpenMobileAppParameters() {
            return this.openMobileAppParameters;
        }

        public final java.lang.String getPackageName() {
            return this.packageName;
        }

        public final int hashCode() {
            return this.openMobileAppParameters.hashCode() + com.payair.csdk.w3.a(this.packageName, this.action.hashCode() * 31, 31);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.action;
            java.lang.String str2 = this.packageName;
            com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto openMobileAppParametersDto = this.openMobileAppParameters;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenIssuerMobileAppAndroidIntentDto(action=");
            sb.append(str);
            sb.append(", packageName=");
            sb.append(str2);
            sb.append(", openMobileAppParameters=");
            sb.append(openMobileAppParametersDto);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto)) {
                return false;
            }
            com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto openIssuerMobileAppAndroidIntentDto = (com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.action, openIssuerMobileAppAndroidIntentDto.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageName, openIssuerMobileAppAndroidIntentDto.packageName) && kotlin.jvm.internal.Intrinsics.areEqual(this.openMobileAppParameters, openIssuerMobileAppAndroidIntentDto.openMobileAppParameters);
        }

        public final com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto copy(java.lang.String action, java.lang.String packageName, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto openMobileAppParameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMobileAppParameters, "");
            return new com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto(action, packageName, openMobileAppParameters);
        }

        /* renamed from: component3, reason: from getter */
        public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto getOpenMobileAppParameters() {
            return this.openMobileAppParameters;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPackageName() {
            return this.packageName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        public static /* synthetic */ com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto copy$default(com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto openIssuerMobileAppAndroidIntentDto, java.lang.String str, java.lang.String str2, com.payair.logic.remote.model.ResponseCompleteTokenizeDto.OpenMobileAppParametersDto openMobileAppParametersDto, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openIssuerMobileAppAndroidIntentDto.action;
            }
            if ((i & 2) != 0) {
                str2 = openIssuerMobileAppAndroidIntentDto.packageName;
            }
            if ((i & 4) != 0) {
                openMobileAppParametersDto = openIssuerMobileAppAndroidIntentDto.openMobileAppParameters;
            }
            return openIssuerMobileAppAndroidIntentDto.copy(str, str2, openMobileAppParametersDto);
        }
    }

    public final java.lang.String toString() {
        com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto activateWithIssuerMobileAppAndroidIntentDto = this.activateWithIssuerMobileAppAndroidIntent;
        com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto openIssuerMobileAppAndroidIntentDto = this.openIssuerMobileAppAndroidIntent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IssuerMobileAppDto(activateWithIssuerMobileAppAndroidIntent=");
        sb.append(activateWithIssuerMobileAppAndroidIntentDto);
        sb.append(", openIssuerMobileAppAndroidIntent=");
        sb.append(openIssuerMobileAppAndroidIntentDto);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto activateWithIssuerMobileAppAndroidIntentDto = this.activateWithIssuerMobileAppAndroidIntent;
        int hashCode = activateWithIssuerMobileAppAndroidIntentDto == null ? 0 : activateWithIssuerMobileAppAndroidIntentDto.hashCode();
        com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto openIssuerMobileAppAndroidIntentDto = this.openIssuerMobileAppAndroidIntent;
        return (hashCode * 31) + (openIssuerMobileAppAndroidIntentDto != null ? openIssuerMobileAppAndroidIntentDto.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.logic.remote.model.IssuerMobileAppDto)) {
            return false;
        }
        com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto = (com.payair.logic.remote.model.IssuerMobileAppDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activateWithIssuerMobileAppAndroidIntent, issuerMobileAppDto.activateWithIssuerMobileAppAndroidIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.openIssuerMobileAppAndroidIntent, issuerMobileAppDto.openIssuerMobileAppAndroidIntent);
    }

    public final com.payair.logic.remote.model.IssuerMobileAppDto copy(com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto activateWithIssuerMobileAppAndroidIntent, com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto openIssuerMobileAppAndroidIntent) {
        return new com.payair.logic.remote.model.IssuerMobileAppDto(activateWithIssuerMobileAppAndroidIntent, openIssuerMobileAppAndroidIntent);
    }

    /* renamed from: component2, reason: from getter */
    public final com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto getOpenIssuerMobileAppAndroidIntent() {
        return this.openIssuerMobileAppAndroidIntent;
    }

    /* renamed from: component1, reason: from getter */
    public final com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto getActivateWithIssuerMobileAppAndroidIntent() {
        return this.activateWithIssuerMobileAppAndroidIntent;
    }

    public static /* synthetic */ com.payair.logic.remote.model.IssuerMobileAppDto copy$default(com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileAppDto, com.payair.logic.remote.model.IssuerMobileAppDto.ActivateWithIssuerMobileAppAndroidIntentDto activateWithIssuerMobileAppAndroidIntentDto, com.payair.logic.remote.model.IssuerMobileAppDto.OpenIssuerMobileAppAndroidIntentDto openIssuerMobileAppAndroidIntentDto, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activateWithIssuerMobileAppAndroidIntentDto = issuerMobileAppDto.activateWithIssuerMobileAppAndroidIntent;
        }
        if ((i & 2) != 0) {
            openIssuerMobileAppAndroidIntentDto = issuerMobileAppDto.openIssuerMobileAppAndroidIntent;
        }
        return issuerMobileAppDto.copy(activateWithIssuerMobileAppAndroidIntentDto, openIssuerMobileAppAndroidIntentDto);
    }
}
