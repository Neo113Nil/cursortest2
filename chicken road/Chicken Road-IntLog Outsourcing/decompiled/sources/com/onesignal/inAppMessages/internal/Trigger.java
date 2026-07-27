package com.onesignal.inAppMessages.internal;

import B4.r;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import n4.InterfaceC1344a;
import org.json.JSONException;
import org.json.JSONObject;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class Trigger {
    private final OSTriggerKind kind;
    private final OSTriggerOperator operatorType;
    private final String property;
    private final String triggerId;
    private final Object value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OSTriggerKind {
        private static final /* synthetic */ InterfaceC1344a $ENTRIES;
        private static final /* synthetic */ OSTriggerKind[] $VALUES;
        public static final Companion Companion;
        private final String value;
        public static final OSTriggerKind TIME_SINCE_LAST_IN_APP = new OSTriggerKind("TIME_SINCE_LAST_IN_APP", 0, "min_time_since");
        public static final OSTriggerKind SESSION_TIME = new OSTriggerKind("SESSION_TIME", 1, "session_time");
        public static final OSTriggerKind CUSTOM = new OSTriggerKind("CUSTOM", 2, NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM);
        public static final OSTriggerKind UNKNOWN = new OSTriggerKind("UNKNOWN", 3, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);

        public static final class Companion {
            public /* synthetic */ Companion(e eVar) {
                this();
            }

            public final OSTriggerKind fromString(String str) {
                for (OSTriggerKind oSTriggerKind : OSTriggerKind.values()) {
                    if (r.I(oSTriggerKind.value, str)) {
                        return oSTriggerKind;
                    }
                }
                return OSTriggerKind.UNKNOWN;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ OSTriggerKind[] $values() {
            return new OSTriggerKind[]{TIME_SINCE_LAST_IN_APP, SESSION_TIME, CUSTOM, UNKNOWN};
        }

        static {
            OSTriggerKind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC1477a.n($values);
            Companion = new Companion(null);
        }

        private OSTriggerKind(String str, int i2, String str2) {
            this.value = str2;
        }

        public static InterfaceC1344a getEntries() {
            return $ENTRIES;
        }

        public static OSTriggerKind valueOf(String str) {
            return (OSTriggerKind) Enum.valueOf(OSTriggerKind.class, str);
        }

        public static OSTriggerKind[] values() {
            return (OSTriggerKind[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OSTriggerOperator {
        private static final /* synthetic */ InterfaceC1344a $ENTRIES;
        private static final /* synthetic */ OSTriggerOperator[] $VALUES;
        public static final Companion Companion;
        private final String text;
        public static final OSTriggerOperator GREATER_THAN = new OSTriggerOperator("GREATER_THAN", 0, "greater");
        public static final OSTriggerOperator LESS_THAN = new OSTriggerOperator("LESS_THAN", 1, "less");
        public static final OSTriggerOperator EQUAL_TO = new OSTriggerOperator("EQUAL_TO", 2, "equal");
        public static final OSTriggerOperator NOT_EQUAL_TO = new OSTriggerOperator("NOT_EQUAL_TO", 3, "not_equal");
        public static final OSTriggerOperator LESS_THAN_OR_EQUAL_TO = new OSTriggerOperator("LESS_THAN_OR_EQUAL_TO", 4, "less_or_equal");
        public static final OSTriggerOperator GREATER_THAN_OR_EQUAL_TO = new OSTriggerOperator("GREATER_THAN_OR_EQUAL_TO", 5, "greater_or_equal");
        public static final OSTriggerOperator EXISTS = new OSTriggerOperator("EXISTS", 6, "exists");
        public static final OSTriggerOperator NOT_EXISTS = new OSTriggerOperator("NOT_EXISTS", 7, "not_exists");
        public static final OSTriggerOperator CONTAINS = new OSTriggerOperator("CONTAINS", 8, "in");

        public static final class Companion {
            public /* synthetic */ Companion(e eVar) {
                this();
            }

            public final OSTriggerOperator fromString(String str) {
                for (OSTriggerOperator oSTriggerOperator : OSTriggerOperator.values()) {
                    if (r.I(oSTriggerOperator.text, str)) {
                        return oSTriggerOperator;
                    }
                }
                return OSTriggerOperator.EQUAL_TO;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ OSTriggerOperator[] $values() {
            return new OSTriggerOperator[]{GREATER_THAN, LESS_THAN, EQUAL_TO, NOT_EQUAL_TO, LESS_THAN_OR_EQUAL_TO, GREATER_THAN_OR_EQUAL_TO, EXISTS, NOT_EXISTS, CONTAINS};
        }

        static {
            OSTriggerOperator[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC1477a.n($values);
            Companion = new Companion(null);
        }

        private OSTriggerOperator(String str, int i2, String str2) {
            this.text = str2;
        }

        public static InterfaceC1344a getEntries() {
            return $ENTRIES;
        }

        public static OSTriggerOperator valueOf(String str) {
            return (OSTriggerOperator) Enum.valueOf(OSTriggerOperator.class, str);
        }

        public static OSTriggerOperator[] values() {
            return (OSTriggerOperator[]) $VALUES.clone();
        }

        public final boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public Trigger(JSONObject json) {
        i.e(json, "json");
        String string = json.getString(OutcomeConstants.OUTCOME_ID);
        i.d(string, "getString(...)");
        this.triggerId = string;
        this.kind = OSTriggerKind.Companion.fromString(json.getString("kind"));
        this.property = json.optString("property", null);
        this.operatorType = OSTriggerOperator.Companion.fromString(json.getString("operator"));
        this.value = json.opt("value");
    }

    public final OSTriggerKind getKind() {
        return this.kind;
    }

    public final OSTriggerOperator getOperatorType() {
        return this.operatorType;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getTriggerId() {
        return this.triggerId;
    }

    public final Object getValue() {
        return this.value;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(OutcomeConstants.OUTCOME_ID, this.triggerId);
            jSONObject.put("kind", this.kind);
            jSONObject.put("property", this.property);
            jSONObject.put("operator", this.operatorType.toString());
            jSONObject.put("value", this.value);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "Trigger{triggerId='" + this.triggerId + "', kind=" + this.kind + ", property='" + this.property + "', operatorType=" + this.operatorType + ", value=" + this.value + '}';
    }
}
