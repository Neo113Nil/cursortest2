package com.google.android.gms.cloudmessaging;

/* loaded from: classes3.dex */
public final class CloudMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.cloudmessaging.CloudMessage> CREATOR = new com.google.android.gms.cloudmessaging.zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    final android.content.Intent zza;
    private java.util.Map zzb;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public CloudMessage(android.content.Intent intent) {
        this.zza = intent;
    }

    private static int zzb(java.lang.String str) {
        if (java.util.Objects.equals(str, com.adjust.sdk.Constants.HIGH)) {
            return 1;
        }
        return java.util.Objects.equals(str, com.adjust.sdk.Constants.NORMAL) ? 2 : 0;
    }

    public final java.lang.String getCollapseKey() {
        return this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getData() {
        java.util.Map<java.lang.String, java.lang.String> map;
        synchronized (this) {
            if (this.zzb == null) {
                android.os.Bundle extras = this.zza.getExtras();
                androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
                if (extras != null) {
                    for (java.lang.String str : extras.keySet()) {
                        java.lang.Object obj = extras.get(str);
                        if (obj instanceof java.lang.String) {
                            java.lang.String str2 = (java.lang.String) obj;
                            if (!str.startsWith(com.google.firebase.messaging.Constants.MessagePayloadKeys.RESERVED_PREFIX) && !str.equals("from") && !str.equals(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE) && !str.equals(com.google.firebase.messaging.Constants.MessagePayloadKeys.COLLAPSE_KEY)) {
                                arrayMap.put(str, str2);
                            }
                        }
                    }
                }
                this.zzb = arrayMap;
            }
            map = this.zzb;
        }
        return map;
    }

    public final java.lang.String getFrom() {
        return this.zza.getStringExtra("from");
    }

    public final java.lang.String getMessageId() {
        java.lang.String stringExtra = this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID);
        return stringExtra == null ? this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER) : stringExtra;
    }

    public final java.lang.String getMessageType() {
        return this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE);
    }

    public final int getOriginalPriority() {
        java.lang.String stringExtra = this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        if (stringExtra == null) {
            stringExtra = this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return zzb(stringExtra);
    }

    public final int getPriority() {
        java.lang.String stringExtra = this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (stringExtra == null) {
            if (java.util.Objects.equals(this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19), "1")) {
                return 2;
            }
            stringExtra = this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return zzb(stringExtra);
    }

    public final byte[] getRawData() {
        return this.zza.getByteArrayExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA);
    }

    public final java.lang.String getSenderId() {
        return this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.SENDER_ID);
    }

    public final long getSentTime() {
        android.os.Bundle extras = this.zza.getExtras();
        java.lang.Object obj = extras != null ? extras.get(com.google.firebase.messaging.Constants.MessagePayloadKeys.SENT_TIME) : null;
        if (obj instanceof java.lang.Long) {
            return ((java.lang.Long) obj).longValue();
        }
        if (!(obj instanceof java.lang.String)) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong((java.lang.String) obj);
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }

    public final java.lang.String getTo() {
        return this.zza.getStringExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.TO);
    }

    public final int getTtl() {
        android.os.Bundle extras = this.zza.getExtras();
        java.lang.Object obj = extras != null ? extras.get(com.google.firebase.messaging.Constants.MessagePayloadKeys.TTL) : null;
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        if (!(obj instanceof java.lang.String)) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt((java.lang.String) obj);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final java.lang.Integer zza() {
        if (this.zza.hasExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRODUCT_ID)) {
            return java.lang.Integer.valueOf(this.zza.getIntExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRODUCT_ID, 0));
        }
        return null;
    }

    public final android.content.Intent getIntent() {
        return this.zza;
    }
}
