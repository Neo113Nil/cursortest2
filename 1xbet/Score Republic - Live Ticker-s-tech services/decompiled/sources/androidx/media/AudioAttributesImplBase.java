package androidx.media;

import java.util.Arrays;
import p000.C0561oy;
import p000.j11;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f571a = 0;

    /* JADX INFO: renamed from: b */
    public int f572b = 0;

    /* JADX INFO: renamed from: c */
    public int f573c = 0;

    /* JADX INFO: renamed from: d */
    public int f574d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f572b == audioAttributesImplBase.f572b) {
            int i2 = this.f573c;
            int i3 = audioAttributesImplBase.f573c;
            int i4 = audioAttributesImplBase.f574d;
            if (i4 == -1) {
                int i5 = audioAttributesImplBase.f571a;
                int i6 = AudioAttributesCompat.f567b;
                if ((i3 & 1) != 1) {
                    i = 4;
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                                i = 10;
                                break;
                            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                            default:
                                i = 3;
                                break;
                            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f571a == audioAttributesImplBase.f571a && this.f574d == i4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f572b), Integer.valueOf(this.f573c), Integer.valueOf(this.f571a), Integer.valueOf(this.f574d)});
    }

    public final String toString() {
        String strM2773h;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f574d != -1) {
            sb.append(" stream=");
            sb.append(this.f574d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f571a;
        int i2 = AudioAttributesCompat.f567b;
        switch (i) {
            case 0:
                strM2773h = "USAGE_UNKNOWN";
                break;
            case 1:
                strM2773h = "USAGE_MEDIA";
                break;
            case 2:
                strM2773h = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM2773h = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM2773h = "USAGE_ALARM";
                break;
            case 5:
                strM2773h = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM2773h = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM2773h = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM2773h = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM2773h = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM2773h = "USAGE_NOTIFICATION_EVENT";
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                strM2773h = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                strM2773h = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                strM2773h = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM2773h = "USAGE_GAME";
                break;
            case 15:
            default:
                strM2773h = j11.m2773h("unknown usage ", i);
                break;
            case 16:
                strM2773h = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM2773h);
        sb.append(" content=");
        sb.append(this.f572b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f573c).toUpperCase());
        return sb.toString();
    }
}
