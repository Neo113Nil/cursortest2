package p000;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p000.C0936z2;

/* JADX INFO: renamed from: z2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0936z2 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9581a;

    public /* synthetic */ C0936z2(int i) {
        this.f9581a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri mediaUri;
        Bundle bundle;
        int iM2814w = 0;
        Account account = null;
        C0253gl c0253gl = null;
        Intent intent = null;
        ArrayList arrayListM2804m = null;
        zb0 zb0Var = null;
        Bundle bundleM2797f = null;
        switch (this.f9581a) {
            case 0:
                parcel.getClass();
                return new C0004a3(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                C0829w6 c0829w6 = new C0829w6(parcel);
                c0829w6.f8438j = parcel.readByte() != 0;
                return c0829w6;
            case 2:
                return new C0759ua(parcel);
            case 3:
                return new C0796va(parcel);
            case 4:
                p50 p50Var = new p50();
                p50Var.f5989j = parcel.readString();
                p50Var.f5990k = parcel.readInt();
                return p50Var;
            case 5:
                u50 u50Var = new u50();
                u50Var.f7677n = null;
                u50Var.f7678o = new ArrayList();
                u50Var.f7679p = new ArrayList();
                u50Var.f7673j = parcel.createStringArrayList();
                u50Var.f7674k = parcel.createStringArrayList();
                u50Var.f7675l = (C0759ua[]) parcel.createTypedArray(C0759ua.CREATOR);
                u50Var.f7676m = parcel.readInt();
                u50Var.f7677n = parcel.readString();
                u50Var.f7678o = parcel.createStringArrayList();
                u50Var.f7679p = parcel.createTypedArrayList(C0796va.CREATOR);
                u50Var.f7680q = parcel.createTypedArrayList(p50.CREATOR);
                return u50Var;
            case 6:
                return new y50(parcel);
            case 7:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0936z2(7);

                    /* JADX INFO: renamed from: j */
                    public final int f257j;

                    /* JADX INFO: renamed from: k */
                    public final MediaDescriptionCompat f258k;

                    {
                        this.f257j = parcel.readInt();
                        this.f258k = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f257j + ", mDescription=" + this.f258k + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.f257j);
                        this.f258k.writeToParcel(parcel2, i);
                    }
                };
            case 8:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(hn0.class.getClassLoader());
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.f267r = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 9:
                return new MediaMetadataCompat(parcel);
            case 10:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0936z2(10);

                    /* JADX INFO: renamed from: j */
                    public final MediaDescriptionCompat f271j;

                    /* JADX INFO: renamed from: k */
                    public final long f272k;

                    {
                        this.f271j = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f272k = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f271j + ", Id=" + this.f272k + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.f271j.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.f272k);
                    }
                };
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f273j = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0936z2(12);

                    /* JADX INFO: renamed from: j */
                    public final Object f274j;

                    {
                        this.f274j = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).f274j;
                        Object obj3 = this.f274j;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.f274j;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable((Parcelable) this.f274j, i);
                    }
                };
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                sr0 sr0Var = new sr0(parcel);
                sr0Var.f7197j = parcel.readInt();
                return sr0Var;
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f275j = parcel.readInt();
                parcelableVolumeInfo.f277l = parcel.readInt();
                parcelableVolumeInfo.f278m = parcel.readInt();
                parcelableVolumeInfo.f279n = parcel.readInt();
                parcelableVolumeInfo.f276k = parcel.readInt();
                return parcelableVolumeInfo;
            case 16:
                return new PlaybackStateCompat(parcel);
            case 17:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 18:
                int iM2785D = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D) {
                    int i = parcel.readInt();
                    if (((char) i) != 2) {
                        j22.m2782A(parcel, i);
                    } else {
                        bundleM2797f = j22.m2797f(parcel, i);
                    }
                }
                j22.m2805n(parcel, iM2785D);
                return new z01(bundleM2797f);
            case 19:
                r21 r21Var = new r21();
                IBinder strongBinder = parcel.readStrongBinder();
                int i2 = q21.f6341c;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(zb0.f9726a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zb0)) {
                        yb0 yb0Var = new yb0();
                        yb0Var.f9259b = strongBinder;
                        zb0Var = yb0Var;
                    } else {
                        zb0Var = (zb0) iInterfaceQueryLocalInterface;
                    }
                }
                r21Var.f6667j = zb0Var;
                return r21Var;
            case 20:
                int iM2785D2 = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D2) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        iM2814w = j22.m2814w(parcel, i3);
                    } else if (c != 2) {
                        j22.m2782A(parcel, i3);
                    } else {
                        arrayListM2804m = j22.m2804m(parcel, i3, xp0.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D2);
                return new uc1(iM2814w, arrayListM2804m);
            case 21:
                int iM2785D3 = j22.m2785D(parcel);
                int iM2814w2 = 0;
                while (parcel.dataPosition() < iM2785D3) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        iM2814w = j22.m2814w(parcel, i4);
                    } else if (c2 == 2) {
                        iM2814w2 = j22.m2814w(parcel, i4);
                    } else if (c2 != 3) {
                        j22.m2782A(parcel, i4);
                    } else {
                        intent = (Intent) j22.m2801j(parcel, i4, Intent.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D3);
                return new xk1(iM2814w, iM2814w2, intent);
            case 22:
                int iM2785D4 = j22.m2785D(parcel);
                long jM2815x = 0;
                String strM2802k = null;
                String strM2802k2 = null;
                String strM2802k3 = null;
                String strM2802k4 = null;
                Uri uri = null;
                String strM2802k5 = null;
                String strM2802k6 = null;
                ArrayList arrayListM2804m2 = null;
                String strM2802k7 = null;
                String strM2802k8 = null;
                while (parcel.dataPosition() < iM2785D4) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 2:
                            strM2802k = j22.m2802k(parcel, i5);
                            break;
                        case 3:
                            strM2802k2 = j22.m2802k(parcel, i5);
                            break;
                        case 4:
                            strM2802k3 = j22.m2802k(parcel, i5);
                            break;
                        case 5:
                            strM2802k4 = j22.m2802k(parcel, i5);
                            break;
                        case 6:
                            uri = (Uri) j22.m2801j(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strM2802k5 = j22.m2802k(parcel, i5);
                            break;
                        case '\b':
                            jM2815x = j22.m2815x(parcel, i5);
                            break;
                        case '\t':
                            strM2802k6 = j22.m2802k(parcel, i5);
                            break;
                        case '\n':
                            arrayListM2804m2 = j22.m2804m(parcel, i5, Scope.CREATOR);
                            break;
                        case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                            strM2802k7 = j22.m2802k(parcel, i5);
                            break;
                        case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                            strM2802k8 = j22.m2802k(parcel, i5);
                            break;
                        default:
                            j22.m2782A(parcel, i5);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D4);
                return new GoogleSignInAccount(strM2802k, strM2802k2, strM2802k3, strM2802k4, uri, strM2802k5, jM2815x, strM2802k6, arrayListM2804m2, strM2802k7, strM2802k8);
            case 23:
                int iM2785D5 = j22.m2785D(parcel);
                long jM2815x2 = 0;
                int iM2814w3 = 0;
                int iM2814w4 = 0;
                boolean zM2812u = false;
                String strM2802k9 = null;
                while (parcel.dataPosition() < iM2785D5) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        iM2814w3 = j22.m2814w(parcel, i6);
                    } else if (c3 == 2) {
                        strM2802k9 = j22.m2802k(parcel, i6);
                    } else if (c3 == 3) {
                        jM2815x2 = j22.m2815x(parcel, i6);
                    } else if (c3 == 4) {
                        iM2814w4 = j22.m2814w(parcel, i6);
                    } else if (c3 != 5) {
                        j22.m2782A(parcel, i6);
                    } else {
                        zM2812u = j22.m2812u(parcel, i6);
                    }
                }
                j22.m2805n(parcel, iM2785D5);
                return new al1(iM2814w3, iM2814w4, jM2815x2, strM2802k9, zM2812u);
            case 24:
                int iM2785D6 = j22.m2785D(parcel);
                ArrayList<String> arrayList = null;
                String strM2802k10 = null;
                while (parcel.dataPosition() < iM2785D6) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        int iM2816y = j22.m2816y(parcel, i7);
                        int iDataPosition = parcel.dataPosition();
                        if (iM2816y == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iM2816y);
                            arrayList = arrayListCreateStringArrayList;
                        }
                    } else if (c4 != 2) {
                        j22.m2782A(parcel, i7);
                    } else {
                        strM2802k10 = j22.m2802k(parcel, i7);
                    }
                }
                j22.m2805n(parcel, iM2785D6);
                return new tl1(strM2802k10, arrayList);
            case 25:
                int iM2785D7 = j22.m2785D(parcel);
                gm1 gm1Var = null;
                while (parcel.dataPosition() < iM2785D7) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iM2814w = j22.m2814w(parcel, i8);
                    } else if (c5 == 2) {
                        c0253gl = (C0253gl) j22.m2801j(parcel, i8, C0253gl.CREATOR);
                    } else if (c5 != 3) {
                        j22.m2782A(parcel, i8);
                    } else {
                        gm1Var = (gm1) j22.m2801j(parcel, i8, gm1.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D7);
                return new am1(iM2814w, c0253gl, gm1Var);
            case 26:
                int iM2785D8 = j22.m2785D(parcel);
                int iM2814w5 = -1;
                long jM2815x3 = 0;
                long jM2815x4 = 0;
                int iM2814w6 = 0;
                int iM2814w7 = 0;
                int iM2814w8 = 0;
                int iM2814w9 = 0;
                String strM2802k11 = null;
                String strM2802k12 = null;
                while (parcel.dataPosition() < iM2785D8) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iM2814w6 = j22.m2814w(parcel, i9);
                            break;
                        case 2:
                            iM2814w7 = j22.m2814w(parcel, i9);
                            break;
                        case 3:
                            iM2814w8 = j22.m2814w(parcel, i9);
                            break;
                        case 4:
                            jM2815x3 = j22.m2815x(parcel, i9);
                            break;
                        case 5:
                            jM2815x4 = j22.m2815x(parcel, i9);
                            break;
                        case 6:
                            strM2802k11 = j22.m2802k(parcel, i9);
                            break;
                        case 7:
                            strM2802k12 = j22.m2802k(parcel, i9);
                            break;
                        case '\b':
                            iM2814w9 = j22.m2814w(parcel, i9);
                            break;
                        case '\t':
                            iM2814w5 = j22.m2814w(parcel, i9);
                            break;
                        default:
                            j22.m2782A(parcel, i9);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D8);
                return new xp0(iM2814w6, iM2814w7, iM2814w8, jM2815x3, jM2815x4, strM2802k11, strM2802k12, iM2814w9, iM2814w5);
            case 27:
                int iM2785D9 = j22.m2785D(parcel);
                int iM2814w10 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iM2785D9) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        iM2814w = j22.m2814w(parcel, i10);
                    } else if (c6 == 2) {
                        account = (Account) j22.m2801j(parcel, i10, Account.CREATOR);
                    } else if (c6 == 3) {
                        iM2814w10 = j22.m2814w(parcel, i10);
                    } else if (c6 != 4) {
                        j22.m2782A(parcel, i10);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) j22.m2801j(parcel, i10, GoogleSignInAccount.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D9);
                return new fm1(iM2814w, account, iM2814w10, googleSignInAccount);
            default:
                int iM2785D10 = j22.m2785D(parcel);
                int iM2814w11 = 0;
                boolean zM2812u2 = false;
                boolean zM2812u3 = false;
                IBinder iBinderM2813v = null;
                C0253gl c0253gl2 = null;
                while (parcel.dataPosition() < iM2785D10) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        iM2814w11 = j22.m2814w(parcel, i11);
                    } else if (c7 == 2) {
                        iBinderM2813v = j22.m2813v(parcel, i11);
                    } else if (c7 == 3) {
                        c0253gl2 = (C0253gl) j22.m2801j(parcel, i11, C0253gl.CREATOR);
                    } else if (c7 == 4) {
                        zM2812u2 = j22.m2812u(parcel, i11);
                    } else if (c7 != 5) {
                        j22.m2782A(parcel, i11);
                    } else {
                        zM2812u3 = j22.m2812u(parcel, i11);
                    }
                }
                j22.m2805n(parcel, iM2785D10);
                return new gm1(iM2814w11, iBinderM2813v, c0253gl2, zM2812u2, zM2812u3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f9581a) {
            case 0:
                return new C0004a3[i];
            case 1:
                return new C0829w6[i];
            case 2:
                return new C0759ua[i];
            case 3:
                return new C0796va[i];
            case 4:
                return new p50[i];
            case 5:
                return new u50[i];
            case 6:
                return new y50[i];
            case 7:
                return new MediaBrowserCompat$MediaItem[i];
            case 8:
                return new MediaDescriptionCompat[i];
            case 9:
                return new MediaMetadataCompat[i];
            case 10:
                return new MediaSessionCompat$QueueItem[i];
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                return new MediaSessionCompat$Token[i];
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                return new sr0[i];
            case 14:
                return new ParcelImpl[i];
            case 15:
                return new ParcelableVolumeInfo[i];
            case 16:
                return new PlaybackStateCompat[i];
            case 17:
                return new RatingCompat[i];
            case 18:
                return new z01[i];
            case 19:
                return new r21[i];
            case 20:
                return new uc1[i];
            case 21:
                return new xk1[i];
            case 22:
                return new GoogleSignInAccount[i];
            case 23:
                return new al1[i];
            case 24:
                return new tl1[i];
            case 25:
                return new am1[i];
            case 26:
                return new xp0[i];
            case 27:
                return new fm1[i];
            default:
                return new gm1[i];
        }
    }
}
