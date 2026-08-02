package com.adjust.sdk;

/* loaded from: classes7.dex */
public class ActivityState implements java.io.Serializable, java.lang.Cloneable {
    private static final int EVENT_DEDUPLICATION_IDS_MAX_SIZE = 10;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 9039439291143138148L;
    private transient com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    protected java.lang.String uuid = com.adjust.sdk.Util.createUuid();
    protected boolean enabled = true;
    protected boolean isGdprForgotten = false;
    protected boolean isThirdPartySharingDisabledForCoppa = false;
    protected boolean askingAttribution = false;
    protected int eventCount = 0;
    protected int sessionCount = 0;
    protected int subsessionCount = -1;
    protected long sessionLength = -1;
    protected long timeSpent = -1;
    protected long lastActivity = -1;
    protected long lastInterval = -1;
    protected java.util.LinkedList<java.lang.String> orderIds = null;
    protected java.lang.String pushToken = null;
    protected java.lang.String adid = null;
    protected long clickTime = 0;
    protected long installBegin = 0;
    protected java.lang.String installReferrer = null;
    protected java.lang.Boolean googlePlayInstant = null;
    protected long clickTimeServer = 0;
    protected long installBeginServer = 0;
    protected java.lang.String installVersion = null;
    protected long clickTimeHuawei = 0;
    protected long installBeginHuawei = 0;
    protected java.lang.String installReferrerHuawei = null;
    protected java.lang.String installReferrerHuaweiAppGallery = null;
    protected long clickTimeXiaomi = 0;
    protected long installBeginXiaomi = 0;
    protected java.lang.String installReferrerXiaomi = null;
    protected long clickTimeServerXiaomi = 0;
    protected long installBeginServerXiaomi = 0;
    protected java.lang.String installVersionXiaomi = null;
    protected long clickTimeSamsung = 0;
    protected long installBeginSamsung = 0;
    protected java.lang.String installReferrerSamsung = null;
    protected long clickTimeVivo = 0;
    protected long installBeginVivo = 0;
    protected java.lang.String installReferrerVivo = null;
    protected java.lang.String installVersionVivo = null;
    protected java.lang.String installReferrerMeta = null;
    protected long clickTimeMeta = 0;
    protected java.lang.Boolean isClickMeta = null;
    protected int eventDeduplicationIdsMaxSize = 10;

    static {
        java.io.ObjectStreamField objectStreamField = new java.io.ObjectStreamField(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, java.lang.String.class);
        java.lang.Class cls = java.lang.Boolean.TYPE;
        java.io.ObjectStreamField objectStreamField2 = new java.io.ObjectStreamField("enabled", cls);
        java.io.ObjectStreamField objectStreamField3 = new java.io.ObjectStreamField("isGdprForgotten", cls);
        java.io.ObjectStreamField objectStreamField4 = new java.io.ObjectStreamField("askingAttribution", cls);
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        java.io.ObjectStreamField objectStreamField5 = new java.io.ObjectStreamField("eventCount", cls2);
        java.io.ObjectStreamField objectStreamField6 = new java.io.ObjectStreamField("sessionCount", cls2);
        java.io.ObjectStreamField objectStreamField7 = new java.io.ObjectStreamField("subsessionCount", cls2);
        java.lang.Class cls3 = java.lang.Long.TYPE;
        serialPersistentFields = new java.io.ObjectStreamField[]{objectStreamField, objectStreamField2, objectStreamField3, objectStreamField4, objectStreamField5, objectStreamField6, objectStreamField7, new java.io.ObjectStreamField("sessionLength", cls3), new java.io.ObjectStreamField("timeSpent", cls3), new java.io.ObjectStreamField("lastActivity", cls3), new java.io.ObjectStreamField("lastInterval", cls3), new java.io.ObjectStreamField("orderIds", java.util.LinkedList.class), new java.io.ObjectStreamField("pushToken", java.lang.String.class), new java.io.ObjectStreamField("adid", java.lang.String.class), new java.io.ObjectStreamField("clickTime", cls3), new java.io.ObjectStreamField("installBegin", cls3), new java.io.ObjectStreamField("installReferrer", java.lang.String.class), new java.io.ObjectStreamField("googlePlayInstant", java.lang.Boolean.class), new java.io.ObjectStreamField("clickTimeServer", cls3), new java.io.ObjectStreamField("installBeginServer", cls3), new java.io.ObjectStreamField("installVersion", java.lang.String.class), new java.io.ObjectStreamField("clickTimeHuawei", cls3), new java.io.ObjectStreamField("installBeginHuawei", cls3), new java.io.ObjectStreamField("installReferrerHuawei", java.lang.String.class), new java.io.ObjectStreamField("installReferrerHuaweiAppGallery", java.lang.String.class), new java.io.ObjectStreamField("isThirdPartySharingDisabledForCoppa", cls), new java.io.ObjectStreamField("clickTimeXiaomi", cls3), new java.io.ObjectStreamField("installBeginXiaomi", cls3), new java.io.ObjectStreamField("installReferrerXiaomi", java.lang.String.class), new java.io.ObjectStreamField("clickTimeServerXiaomi", cls3), new java.io.ObjectStreamField("installBeginServerXiaomi", cls3), new java.io.ObjectStreamField("installVersionXiaomi", java.lang.String.class), new java.io.ObjectStreamField("clickTimeSamsung", cls3), new java.io.ObjectStreamField("installBeginSamsung", cls3), new java.io.ObjectStreamField("installReferrerSamsung", java.lang.String.class), new java.io.ObjectStreamField("clickTimeVivo", cls3), new java.io.ObjectStreamField("installBeginVivo", cls3), new java.io.ObjectStreamField("installReferrerVivo", java.lang.String.class), new java.io.ObjectStreamField("installVersionVivo", java.lang.String.class), new java.io.ObjectStreamField("installReferrerMeta", java.lang.String.class), new java.io.ObjectStreamField("clickTimeMeta", cls3), new java.io.ObjectStreamField("isClickMeta", java.lang.Boolean.class)};
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) {
        java.io.ObjectInputStream.GetField readFields = objectInputStream.readFields();
        this.eventCount = com.adjust.sdk.Util.readIntField(readFields, "eventCount", 0);
        this.sessionCount = com.adjust.sdk.Util.readIntField(readFields, "sessionCount", 0);
        this.subsessionCount = com.adjust.sdk.Util.readIntField(readFields, "subsessionCount", -1);
        this.sessionLength = com.adjust.sdk.Util.readLongField(readFields, "sessionLength", -1L);
        this.timeSpent = com.adjust.sdk.Util.readLongField(readFields, "timeSpent", -1L);
        this.lastActivity = com.adjust.sdk.Util.readLongField(readFields, "lastActivity", -1L);
        this.lastInterval = com.adjust.sdk.Util.readLongField(readFields, "lastInterval", -1L);
        this.uuid = com.adjust.sdk.Util.readStringField(readFields, com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, null);
        this.enabled = com.adjust.sdk.Util.readBooleanField(readFields, "enabled", true);
        this.isGdprForgotten = com.adjust.sdk.Util.readBooleanField(readFields, "isGdprForgotten", false);
        this.isThirdPartySharingDisabledForCoppa = com.adjust.sdk.Util.readBooleanField(readFields, "isThirdPartySharingDisabledForCoppa", false);
        this.askingAttribution = com.adjust.sdk.Util.readBooleanField(readFields, "askingAttribution", false);
        this.orderIds = (java.util.LinkedList) com.adjust.sdk.Util.readObjectField(readFields, "orderIds", null);
        this.pushToken = com.adjust.sdk.Util.readStringField(readFields, "pushToken", null);
        this.adid = com.adjust.sdk.Util.readStringField(readFields, "adid", null);
        this.clickTime = com.adjust.sdk.Util.readLongField(readFields, "clickTime", -1L);
        this.installBegin = com.adjust.sdk.Util.readLongField(readFields, "installBegin", -1L);
        this.installReferrer = com.adjust.sdk.Util.readStringField(readFields, "installReferrer", null);
        this.googlePlayInstant = (java.lang.Boolean) com.adjust.sdk.Util.readObjectField(readFields, "googlePlayInstant", null);
        this.clickTimeServer = com.adjust.sdk.Util.readLongField(readFields, "clickTimeServer", -1L);
        this.installBeginServer = com.adjust.sdk.Util.readLongField(readFields, "installBeginServer", -1L);
        this.installVersion = com.adjust.sdk.Util.readStringField(readFields, "installVersion", null);
        this.clickTimeHuawei = com.adjust.sdk.Util.readLongField(readFields, "clickTimeHuawei", -1L);
        this.installBeginHuawei = com.adjust.sdk.Util.readLongField(readFields, "installBeginHuawei", -1L);
        this.installReferrerHuawei = com.adjust.sdk.Util.readStringField(readFields, "installReferrerHuawei", null);
        this.installReferrerHuaweiAppGallery = com.adjust.sdk.Util.readStringField(readFields, "installReferrerHuaweiAppGallery", null);
        this.clickTimeXiaomi = com.adjust.sdk.Util.readLongField(readFields, "clickTimeXiaomi", -1L);
        this.installBeginXiaomi = com.adjust.sdk.Util.readLongField(readFields, "installBeginXiaomi", -1L);
        this.installReferrerXiaomi = com.adjust.sdk.Util.readStringField(readFields, "installReferrerXiaomi", null);
        this.clickTimeServerXiaomi = com.adjust.sdk.Util.readLongField(readFields, "clickTimeServerXiaomi", -1L);
        this.installBeginServerXiaomi = com.adjust.sdk.Util.readLongField(readFields, "installBeginServerXiaomi", -1L);
        this.installVersionXiaomi = com.adjust.sdk.Util.readStringField(readFields, "installVersionXiaomi", null);
        this.clickTimeSamsung = com.adjust.sdk.Util.readLongField(readFields, "clickTimeSamsung", -1L);
        this.installBeginSamsung = com.adjust.sdk.Util.readLongField(readFields, "installBeginSamsung", -1L);
        this.installReferrerSamsung = com.adjust.sdk.Util.readStringField(readFields, "installReferrerSamsung", null);
        this.clickTimeVivo = com.adjust.sdk.Util.readLongField(readFields, "clickTimeVivo", -1L);
        this.installBeginVivo = com.adjust.sdk.Util.readLongField(readFields, "installBeginVivo", -1L);
        this.installReferrerVivo = com.adjust.sdk.Util.readStringField(readFields, "installReferrerVivo", null);
        this.installVersionVivo = com.adjust.sdk.Util.readStringField(readFields, "installVersionVivo", null);
        this.installReferrerMeta = com.adjust.sdk.Util.readStringField(readFields, "installReferrerMeta", null);
        this.clickTimeMeta = com.adjust.sdk.Util.readLongField(readFields, "clickTimeMeta", -1L);
        this.isClickMeta = (java.lang.Boolean) com.adjust.sdk.Util.readObjectField(readFields, "isClickMeta", null);
        if (this.uuid == null) {
            this.uuid = com.adjust.sdk.Util.createUuid();
        }
        this.eventDeduplicationIdsMaxSize = 10;
    }

    private static java.lang.String stamp(long j) {
        java.util.Calendar.getInstance().setTimeInMillis(j);
        return com.adjust.sdk.Util.formatString("%02d:%02d:%02d", 11, 12, 13);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public void addDeduplicationId(java.lang.String str) {
        if (this.eventDeduplicationIdsMaxSize == 0) {
            return;
        }
        if (this.orderIds == null) {
            this.orderIds = new java.util.LinkedList<>();
        } else {
            while (this.orderIds.size() >= this.eventDeduplicationIdsMaxSize) {
                this.orderIds.removeLast();
            }
        }
        this.orderIds.addFirst(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.adjust.sdk.ActivityState activityState = (com.adjust.sdk.ActivityState) obj;
        return com.adjust.sdk.Util.equalString(this.uuid, activityState.uuid) && com.adjust.sdk.Util.equalBoolean(java.lang.Boolean.valueOf(this.enabled), java.lang.Boolean.valueOf(activityState.enabled)) && com.adjust.sdk.Util.equalBoolean(java.lang.Boolean.valueOf(this.isGdprForgotten), java.lang.Boolean.valueOf(activityState.isGdprForgotten)) && com.adjust.sdk.Util.equalBoolean(java.lang.Boolean.valueOf(this.isThirdPartySharingDisabledForCoppa), java.lang.Boolean.valueOf(activityState.isThirdPartySharingDisabledForCoppa)) && com.adjust.sdk.Util.equalBoolean(java.lang.Boolean.valueOf(this.askingAttribution), java.lang.Boolean.valueOf(activityState.askingAttribution)) && com.adjust.sdk.Util.equalInt(java.lang.Integer.valueOf(this.eventCount), java.lang.Integer.valueOf(activityState.eventCount)) && com.adjust.sdk.Util.equalInt(java.lang.Integer.valueOf(this.sessionCount), java.lang.Integer.valueOf(activityState.sessionCount)) && com.adjust.sdk.Util.equalInt(java.lang.Integer.valueOf(this.subsessionCount), java.lang.Integer.valueOf(activityState.subsessionCount)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.sessionLength), java.lang.Long.valueOf(activityState.sessionLength)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.timeSpent), java.lang.Long.valueOf(activityState.timeSpent)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.lastInterval), java.lang.Long.valueOf(activityState.lastInterval)) && com.adjust.sdk.Util.equalObject(this.orderIds, activityState.orderIds) && com.adjust.sdk.Util.equalString(this.pushToken, activityState.pushToken) && com.adjust.sdk.Util.equalString(this.adid, activityState.adid) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.clickTime), java.lang.Long.valueOf(activityState.clickTime)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.installBegin), java.lang.Long.valueOf(activityState.installBegin)) && com.adjust.sdk.Util.equalString(this.installReferrer, activityState.installReferrer) && com.adjust.sdk.Util.equalBoolean(this.googlePlayInstant, activityState.googlePlayInstant) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.clickTimeServer), java.lang.Long.valueOf(activityState.clickTimeServer)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.installBeginServer), java.lang.Long.valueOf(activityState.installBeginServer)) && com.adjust.sdk.Util.equalString(this.installVersion, activityState.installVersion) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.clickTimeHuawei), java.lang.Long.valueOf(activityState.clickTimeHuawei)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.installBeginHuawei), java.lang.Long.valueOf(activityState.installBeginHuawei)) && com.adjust.sdk.Util.equalString(this.installReferrerHuawei, activityState.installReferrerHuawei) && com.adjust.sdk.Util.equalString(this.installReferrerHuaweiAppGallery, activityState.installReferrerHuaweiAppGallery) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.clickTimeXiaomi), java.lang.Long.valueOf(activityState.clickTimeXiaomi)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.installBeginXiaomi), java.lang.Long.valueOf(activityState.installBeginXiaomi)) && com.adjust.sdk.Util.equalString(this.installReferrerXiaomi, activityState.installReferrerXiaomi) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.clickTimeServerXiaomi), java.lang.Long.valueOf(activityState.clickTimeServerXiaomi)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.installBeginServerXiaomi), java.lang.Long.valueOf(activityState.installBeginServerXiaomi)) && com.adjust.sdk.Util.equalString(this.installVersionXiaomi, activityState.installVersionXiaomi) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.clickTimeSamsung), java.lang.Long.valueOf(activityState.clickTimeSamsung)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.installBeginSamsung), java.lang.Long.valueOf(activityState.installBeginSamsung)) && com.adjust.sdk.Util.equalString(this.installReferrerSamsung, activityState.installReferrerSamsung) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.clickTimeVivo), java.lang.Long.valueOf(activityState.clickTimeVivo)) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.installBeginVivo), java.lang.Long.valueOf(activityState.installBeginVivo)) && com.adjust.sdk.Util.equalString(this.installReferrerVivo, activityState.installReferrerVivo) && com.adjust.sdk.Util.equalString(this.installVersionVivo, activityState.installVersionVivo) && com.adjust.sdk.Util.equalString(this.installReferrerMeta, activityState.installReferrerMeta) && com.adjust.sdk.Util.equalLong(java.lang.Long.valueOf(this.clickTimeMeta), java.lang.Long.valueOf(activityState.clickTimeMeta)) && com.adjust.sdk.Util.equalBoolean(this.isClickMeta, activityState.isClickMeta);
    }

    public boolean eventDeduplicationIdExists(java.lang.String str) {
        java.util.LinkedList<java.lang.String> linkedList = this.orderIds;
        if (linkedList == null) {
            return false;
        }
        return linkedList.contains(str);
    }

    public int hashCode() {
        int hashBoolean = com.adjust.sdk.Util.hashBoolean(java.lang.Boolean.valueOf(this.askingAttribution), com.adjust.sdk.Util.hashBoolean(java.lang.Boolean.valueOf(this.isThirdPartySharingDisabledForCoppa), com.adjust.sdk.Util.hashBoolean(java.lang.Boolean.valueOf(this.isGdprForgotten), com.adjust.sdk.Util.hashBoolean(java.lang.Boolean.valueOf(this.enabled), com.adjust.sdk.Util.hashString(this.uuid, 17)))));
        int i = this.eventCount;
        int i2 = this.sessionCount;
        return com.adjust.sdk.Util.hashBoolean(this.isClickMeta, com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.clickTimeMeta), com.adjust.sdk.Util.hashString(this.installReferrerMeta, com.adjust.sdk.Util.hashString(this.installVersionVivo, com.adjust.sdk.Util.hashString(this.installReferrerVivo, com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.installBeginVivo), com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.clickTimeVivo), com.adjust.sdk.Util.hashString(this.installReferrerSamsung, com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.installBeginSamsung), com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.clickTimeSamsung), com.adjust.sdk.Util.hashString(this.installVersionXiaomi, com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.installBeginServerXiaomi), com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.clickTimeServerXiaomi), com.adjust.sdk.Util.hashString(this.installReferrerXiaomi, com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.installBeginXiaomi), com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.clickTimeXiaomi), com.adjust.sdk.Util.hashString(this.installReferrerHuaweiAppGallery, com.adjust.sdk.Util.hashString(this.installReferrerHuawei, com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.installBeginHuawei), com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.clickTimeHuawei), com.adjust.sdk.Util.hashString(this.installVersion, com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.installBeginServer), com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.clickTimeServer), com.adjust.sdk.Util.hashBoolean(this.googlePlayInstant, com.adjust.sdk.Util.hashString(this.installReferrer, com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.installBegin), com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.clickTime), com.adjust.sdk.Util.hashString(this.adid, com.adjust.sdk.Util.hashString(this.pushToken, com.adjust.sdk.Util.hashObject(this.orderIds, com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.lastInterval), com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.timeSpent), com.adjust.sdk.Util.hashLong(java.lang.Long.valueOf(this.sessionLength), (((((hashBoolean * 37) + i) * 37) + i2) * 37) + this.subsessionCount)))))))))))))))))))))))))))))))));
    }

    public void resetSessionAttributes(long j) {
        this.subsessionCount = 1;
        this.sessionLength = 0L;
        this.timeSpent = 0L;
        this.lastActivity = j;
        this.lastInterval = -1L;
    }

    public void setEventDeduplicationIdsMaxSize(java.lang.Integer num) {
        if (num == null || num.intValue() < 0) {
            return;
        }
        this.eventDeduplicationIdsMaxSize = num.intValue();
    }

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString("ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s", java.lang.Integer.valueOf(this.eventCount), java.lang.Integer.valueOf(this.sessionCount), java.lang.Integer.valueOf(this.subsessionCount), java.lang.Double.valueOf(this.sessionLength / 1000.0d), java.lang.Double.valueOf(this.timeSpent / 1000.0d), stamp(this.lastActivity), this.uuid);
    }
}
