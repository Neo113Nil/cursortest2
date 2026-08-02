package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public enum MessagingEdgeEventType {
    PUSH_APPLICATION_OPENED(4),
    PUSH_CUSTOM_ACTION(5),
    DISMISS(6),
    INTERACT(7),
    TRIGGER(8),
    DISPLAY(9),
    DISQUALIFY(10),
    SUPPRESS_DISPLAY(11);

    final int getHighSpeedVideoFpsRangesFor;

    MessagingEdgeEventType(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @java.lang.Deprecated
    public final int getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: com.adobe.marketing.mobile.MessagingEdgeEventType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.MessagingEdgeEventType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.adobe.marketing.mobile.MessagingEdgeEventType.DISMISS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.MessagingEdgeEventType.INTERACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.MessagingEdgeEventType.TRIGGER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.MessagingEdgeEventType.DISPLAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.MessagingEdgeEventType.DISQUALIFY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.MessagingEdgeEventType.SUPPRESS_DISPLAY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.MessagingEdgeEventType.PUSH_APPLICATION_OPENED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.MessagingEdgeEventType.PUSH_CUSTOM_ACTION.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public final java.lang.String getPropositionEventType() {
        switch (com.adobe.marketing.mobile.MessagingEdgeEventType.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[ordinal()]) {
            case 1:
                return "dismiss";
            case 2:
                return "interact";
            case 3:
                return "trigger";
            case 4:
                return com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION;
            case 5:
                return "disqualify";
            case 6:
                return "suppressDisplay";
            default:
                return "";
        }
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        switch (com.adobe.marketing.mobile.MessagingEdgeEventType.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[ordinal()]) {
            case 1:
                return "decisioning.propositionDismiss";
            case 2:
                return "decisioning.propositionInteract";
            case 3:
                return "decisioning.propositionTrigger";
            case 4:
                return "decisioning.propositionDisplay";
            case 5:
                return "decisioning.propositionDisqualify";
            case 6:
                return "decisioning.propositionSuppressDisplay";
            case 7:
                return "pushTracking.applicationOpened";
            case 8:
                return "pushTracking.customAction";
            default:
                return super.toString();
        }
    }
}
