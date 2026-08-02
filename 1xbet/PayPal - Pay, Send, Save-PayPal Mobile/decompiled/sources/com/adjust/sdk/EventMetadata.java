package com.adjust.sdk;

/* loaded from: classes7.dex */
public class EventMetadata implements java.io.Serializable {
    private static final java.io.ObjectStreamField[] serialPersistentFields = {new java.io.ObjectStreamField("eventSequence", java.util.Map.class)};
    private static final long serialVersionUID = 1;
    private java.util.Map<java.lang.String, java.lang.Integer> eventSequence = new java.util.HashMap();

    private void readObject(java.io.ObjectInputStream objectInputStream) {
        this.eventSequence = (java.util.Map) com.adjust.sdk.Util.readObjectField(objectInputStream.readFields(), "eventSequence", new java.util.HashMap());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && com.adjust.sdk.Util.equalObject(this.eventSequence, ((com.adjust.sdk.EventMetadata) obj).eventSequence);
    }

    public int hashCode() {
        return com.adjust.sdk.Util.hashObject(this.eventSequence, 17);
    }

    public int incrementSequenceForEvent(java.lang.String str) {
        java.lang.Integer num = this.eventSequence.get(str);
        int intValue = (num != null ? num.intValue() : 0) + 1;
        this.eventSequence.put(str, java.lang.Integer.valueOf(intValue));
        return intValue;
    }
}
