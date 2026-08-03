package org.slf4j.event;

/* loaded from: classes6.dex */
public class KeyValuePair {
    public final java.lang.String key;
    public final java.lang.Object value;

    public KeyValuePair(java.lang.String str, java.lang.Object obj) {
        this.key = str;
        this.value = obj;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.key) + "=\"" + java.lang.String.valueOf(this.value) + "\"";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.slf4j.event.KeyValuePair keyValuePair = (org.slf4j.event.KeyValuePair) obj;
        return java.util.Objects.equals(this.key, keyValuePair.key) && java.util.Objects.equals(this.value, keyValuePair.value);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.key, this.value);
    }
}
