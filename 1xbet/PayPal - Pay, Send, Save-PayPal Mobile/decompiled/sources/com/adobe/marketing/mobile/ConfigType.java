package com.adobe.marketing.mobile;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType;", "", "AppID", "Bundled", "FileInAssets", "FileInPath", "Lcom/adobe/marketing/mobile/ConfigType$AppID;", "Lcom/adobe/marketing/mobile/ConfigType$Bundled;", "Lcom/adobe/marketing/mobile/ConfigType$FileInAssets;", "Lcom/adobe/marketing/mobile/ConfigType$FileInPath;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface ConfigType {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType$Bundled;", "Lcom/adobe/marketing/mobile/ConfigType;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Bundled implements com.adobe.marketing.mobile.ConfigType {
        public static final int $stable = 0;
        public static final com.adobe.marketing.mobile.ConfigType.Bundled INSTANCE = new com.adobe.marketing.mobile.ConfigType.Bundled();

        private Bundled() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType$AppID;", "Lcom/adobe/marketing/mobile/ConfigType;", "", "appID", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/adobe/marketing/mobile/ConfigType$AppID;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAppID"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class AppID implements com.adobe.marketing.mobile.ConfigType {
        public static final int $stable = 0;
        private final java.lang.String appID;

        public AppID(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.appID = str;
        }

        public final java.lang.String getAppID() {
            return this.appID;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AppID(appID=");
            sb.append(this.appID);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.appID.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.adobe.marketing.mobile.ConfigType.AppID) && kotlin.jvm.internal.Intrinsics.areEqual(this.appID, ((com.adobe.marketing.mobile.ConfigType.AppID) other).appID);
        }

        public final com.adobe.marketing.mobile.ConfigType.AppID copy(java.lang.String appID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appID, "");
            return new com.adobe.marketing.mobile.ConfigType.AppID(appID);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAppID() {
            return this.appID;
        }

        public static /* synthetic */ com.adobe.marketing.mobile.ConfigType.AppID copy$default(com.adobe.marketing.mobile.ConfigType.AppID appID, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = appID.appID;
            }
            return appID.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType$FileInAssets;", "Lcom/adobe/marketing/mobile/ConfigType;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/adobe/marketing/mobile/ConfigType$FileInAssets;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFilePath"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class FileInAssets implements com.adobe.marketing.mobile.ConfigType {
        public static final int $stable = 0;
        private final java.lang.String filePath;

        public FileInAssets(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filePath = str;
        }

        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FileInAssets(filePath=");
            sb.append(this.filePath);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.filePath.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.adobe.marketing.mobile.ConfigType.FileInAssets) && kotlin.jvm.internal.Intrinsics.areEqual(this.filePath, ((com.adobe.marketing.mobile.ConfigType.FileInAssets) other).filePath);
        }

        public final com.adobe.marketing.mobile.ConfigType.FileInAssets copy(java.lang.String filePath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
            return new com.adobe.marketing.mobile.ConfigType.FileInAssets(filePath);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        public static /* synthetic */ com.adobe.marketing.mobile.ConfigType.FileInAssets copy$default(com.adobe.marketing.mobile.ConfigType.FileInAssets fileInAssets, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fileInAssets.filePath;
            }
            return fileInAssets.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType$FileInPath;", "Lcom/adobe/marketing/mobile/ConfigType;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/adobe/marketing/mobile/ConfigType$FileInPath;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFilePath"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class FileInPath implements com.adobe.marketing.mobile.ConfigType {
        public static final int $stable = 0;
        private final java.lang.String filePath;

        public FileInPath(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filePath = str;
        }

        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FileInPath(filePath=");
            sb.append(this.filePath);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.filePath.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.adobe.marketing.mobile.ConfigType.FileInPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.filePath, ((com.adobe.marketing.mobile.ConfigType.FileInPath) other).filePath);
        }

        public final com.adobe.marketing.mobile.ConfigType.FileInPath copy(java.lang.String filePath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
            return new com.adobe.marketing.mobile.ConfigType.FileInPath(filePath);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilePath() {
            return this.filePath;
        }

        public static /* synthetic */ com.adobe.marketing.mobile.ConfigType.FileInPath copy$default(com.adobe.marketing.mobile.ConfigType.FileInPath fileInPath, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fileInPath.filePath;
            }
            return fileInPath.copy(str);
        }
    }
}
