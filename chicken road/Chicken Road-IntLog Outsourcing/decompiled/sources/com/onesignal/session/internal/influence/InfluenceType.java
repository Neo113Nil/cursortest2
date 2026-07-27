package com.onesignal.session.internal.influence;

import B4.r;
import kotlin.jvm.internal.e;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class InfluenceType {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ InfluenceType[] $VALUES;
    public static final Companion Companion;
    public static final InfluenceType DIRECT = new InfluenceType("DIRECT", 0);
    public static final InfluenceType INDIRECT = new InfluenceType("INDIRECT", 1);
    public static final InfluenceType UNATTRIBUTED = new InfluenceType("UNATTRIBUTED", 2);
    public static final InfluenceType DISABLED = new InfluenceType("DISABLED", 3);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final InfluenceType fromString(String str) {
            InfluenceType influenceType;
            if (str != null) {
                InfluenceType[] values = InfluenceType.values();
                int length = values.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = length - 1;
                        influenceType = values[length];
                        if (r.I(influenceType.name(), str)) {
                            break;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    }
                }
                influenceType = null;
                if (influenceType != null) {
                    return influenceType;
                }
            }
            return InfluenceType.UNATTRIBUTED;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ InfluenceType[] $values() {
        return new InfluenceType[]{DIRECT, INDIRECT, UNATTRIBUTED, DISABLED};
    }

    static {
        InfluenceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
        Companion = new Companion(null);
    }

    private InfluenceType(String str, int i2) {
    }

    public static final InfluenceType fromString(String str) {
        return Companion.fromString(str);
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static InfluenceType valueOf(String str) {
        return (InfluenceType) Enum.valueOf(InfluenceType.class, str);
    }

    public static InfluenceType[] values() {
        return (InfluenceType[]) $VALUES.clone();
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }
}
