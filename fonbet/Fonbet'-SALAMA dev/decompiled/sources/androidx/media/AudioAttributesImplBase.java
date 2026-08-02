package androidx.media;

import e1.k;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f9653a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9654b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9655c = 0;

    /* renamed from: d, reason: collision with root package name */
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
        int a2 = audioAttributesImplBase.a();
        if (a2 == 6) {
            i8 |= 4;
        } else if (a2 == 7) {
            i8 |= 1;
        }
        return i7 == (i8 & 273) && this.f9653a == audioAttributesImplBase.f9653a && this.f9656d == audioAttributesImplBase.f9656d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9654b), Integer.valueOf(this.f9655c), Integer.valueOf(this.f9653a), Integer.valueOf(this.f9656d)});
    }

    public final String toString() {
        String str;
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
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = k.d(i7, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f9654b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f9655c).toUpperCase());
        return sb.toString();
    }
}
