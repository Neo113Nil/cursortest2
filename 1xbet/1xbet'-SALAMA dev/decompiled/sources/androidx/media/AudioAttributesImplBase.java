package androidx.media;

import java.util.Arrays;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9653a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9654b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9655c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9656d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i7 = this.f9656d;
        return i7 != -1 ? i7 : AudioAttributesCompat.c(this.f9655c, this.f9653a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f9654b != audioAttributesImplBase.f9654b) {
            return false;
        }
        int i7 = this.f9655c;
        int i8 = audioAttributesImplBase.f9655c;
        int iA = audioAttributesImplBase.a();
        if (iA == 6) {
            i8 |= 4;
        } else if (iA == 7) {
            i8 |= 1;
        }
        return i7 == (i8 & 273) && this.f9653a == audioAttributesImplBase.f9653a && this.f9656d == audioAttributesImplBase.f9656d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9654b), Integer.valueOf(this.f9655c), Integer.valueOf(this.f9653a), Integer.valueOf(this.f9656d)});
    }

    public final String toString() {
        String strD;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f9656d != -1) {
            sb.append(" stream=");
            sb.append(this.f9656d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i7 = this.f9653a;
        int i8 = AudioAttributesCompat.f9649b;
        switch (i7) {
            case 0:
                strD = "USAGE_UNKNOWN";
                break;
            case 1:
                strD = "USAGE_MEDIA";
                break;
            case 2:
                strD = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strD = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strD = "USAGE_ALARM";
                break;
            case 5:
                strD = "USAGE_NOTIFICATION";
                break;
            case 6:
                strD = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strD = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strD = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strD = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strD = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strD = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strD = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strD = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strD = "USAGE_GAME";
                break;
            case 15:
            default:
                strD = k.d(i7, "unknown usage ");
                break;
            case 16:
                strD = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strD);
        sb.append(" content=");
        sb.append(this.f9654b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f9655c).toUpperCase());
        return sb.toString();
    }
}
