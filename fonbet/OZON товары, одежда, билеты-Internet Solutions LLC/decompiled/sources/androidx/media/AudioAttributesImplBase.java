package androidx.media;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f43449a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f43450b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f43451c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f43452d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f43450b != audioAttributesImplBase.f43450b) {
            return false;
        }
        int i11 = this.f43451c;
        int i12 = audioAttributesImplBase.f43451c;
        int i13 = audioAttributesImplBase.f43452d;
        if (i13 == -1) {
            i13 = AudioAttributesCompat.b(i12, audioAttributesImplBase.f43449a);
        }
        if (i13 == 6) {
            i12 |= 4;
        } else if (i13 == 7) {
            i12 |= 1;
        }
        return i11 == (i12 & 273) && this.f43449a == audioAttributesImplBase.f43449a && this.f43452d == audioAttributesImplBase.f43452d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f43450b), Integer.valueOf(this.f43451c), Integer.valueOf(this.f43449a), Integer.valueOf(this.f43452d)});
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f43452d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f43452d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i11 = this.f43449a;
        int i12 = AudioAttributesCompat.f43443b;
        switch (i11) {
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
                str = Ej.b.a(i11, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f43450b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f43451c).toUpperCase());
        return sb2.toString();
    }
}
