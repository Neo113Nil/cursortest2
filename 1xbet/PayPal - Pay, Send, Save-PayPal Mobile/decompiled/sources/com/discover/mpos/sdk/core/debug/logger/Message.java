package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/Message;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "Lcom/discover/mpos/sdk/core/debug/logger/MessageType;", "priority", "", com.adobe.marketing.mobile.services.ui.alert.views.AlertTestTags.MESSAGE_TEXT, "tag", "Ljava/util/Date;", "date", "(Lcom/discover/mpos/sdk/core/debug/logger/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "dateToText", "()Ljava/lang/String;", "", "describeContents", "()I", "toString", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "datePattern", "Ljava/lang/String;", "getMessageText", "Lcom/discover/mpos/sdk/core/debug/logger/MessageType;", "getPriority", "()Lcom/discover/mpos/sdk/core/debug/logger/MessageType;", "getTag", "CREATOR"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public class Message implements android.os.Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final com.discover.mpos.sdk.core.debug.logger.Message.Companion INSTANCE = new com.discover.mpos.sdk.core.debug.logger.Message.Companion(null);
    private static final java.lang.String EMPTY_STRING = "";
    private final java.util.Date date;
    private final java.lang.String datePattern;
    private final java.lang.String messageText;
    private final com.discover.mpos.sdk.core.debug.logger.MessageType priority;
    private final java.lang.String tag;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Message(com.discover.mpos.sdk.core.debug.logger.MessageType messageType, java.lang.String str, java.lang.String str2, java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        this.priority = messageType;
        this.messageText = str;
        this.tag = str2;
        this.date = date;
        this.datePattern = "HH:mm:ss.SSS";
    }

    public final com.discover.mpos.sdk.core.debug.logger.MessageType getPriority() {
        return this.priority;
    }

    public final java.lang.String getMessageText() {
        return this.messageText;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public /* synthetic */ Message(com.discover.mpos.sdk.core.debug.logger.MessageType messageType, java.lang.String str, java.lang.String str2, java.util.Date date, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(messageType, str, str2, (i & 8) != 0 ? new java.util.Date() : date);
    }

    public final java.util.Date getDate() {
        return this.date;
    }

    public final java.lang.String dateToText() {
        return new java.text.SimpleDateFormat(this.datePattern, java.util.Locale.getDefault()).format(this.date);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Message(android.os.Parcel parcel) {
        this(r1, r2, r3 != null ? r3 : "", new java.util.Date(parcel.readLong()));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        java.lang.String readString = parcel.readString();
        com.discover.mpos.sdk.core.debug.logger.MessageType valueOf = com.discover.mpos.sdk.core.debug.logger.MessageType.valueOf(readString == null ? "" : readString);
        java.lang.String readString2 = parcel.readString();
        readString2 = readString2 == null ? "" : readString2;
        java.lang.String readString3 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.priority.name());
        parcel.writeString(this.messageText);
        parcel.writeString(this.tag);
        parcel.writeLong(this.date.getTime());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(dateToText());
        sb.append(" - ");
        sb.append(this.priority);
        sb.append(" - ");
        sb.append(this.tag);
        sb.append(" - ");
        sb.append(this.messageText);
        return sb.toString();
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/Message$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/discover/mpos/sdk/core/debug/logger/Message;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/discover/mpos/sdk/core/debug/logger/Message;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "newArray", "(I)[Lcom/discover/mpos/sdk/core/debug/logger/Message;", "", "EMPTY_STRING", "Ljava/lang/String;"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.core.debug.logger.Message$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements android.os.Parcelable.Creator<com.discover.mpos.sdk.core.debug.logger.Message> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.discover.mpos.sdk.core.debug.logger.Message createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.discover.mpos.sdk.core.debug.logger.Message(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.discover.mpos.sdk.core.debug.logger.Message[] newArray(int size) {
            return new com.discover.mpos.sdk.core.debug.logger.Message[size];
        }
    }
}
