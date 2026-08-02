package io.objectbox.relation;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class ToOne<TARGET> implements Serializable {
    private static final long serialVersionUID = 5092547044335989281L;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ToOne)) {
            return false;
        }
        ((ToOne) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public void setTargetId(long j) {
        try {
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Could not update to-one ID in entity", e);
        }
    }
}
