package V2;

import A1.W;
import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import java.util.HashSet;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6637a;

    public /* synthetic */ a(int i7) {
        this.f6637a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6637a) {
            case 0:
                int iA0 = Q0.a.a0(parcel);
                int iN = 0;
                String strN = null;
                Account account = null;
                int iN2 = 0;
                while (parcel.dataPosition() < iA0) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        iN = Q0.a.N(i7, parcel);
                    } else if (c3 == 2) {
                        iN2 = Q0.a.N(i7, parcel);
                    } else if (c3 == 3) {
                        strN = Q0.a.n(i7, parcel);
                    } else if (c3 != 4) {
                        Q0.a.X(i7, parcel);
                    } else {
                        account = (Account) Q0.a.m(parcel, i7, Account.CREATOR);
                    }
                }
                Q0.a.y(iA0, parcel);
                return new AccountChangeEventsRequest(iN, iN2, strN, account);
            case 1:
                int iA1 = Q0.a.a0(parcel);
                int iN3 = 0;
                ArrayList arrayListR = null;
                while (parcel.dataPosition() < iA1) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 1) {
                        iN3 = Q0.a.N(i8, parcel);
                    } else if (c4 != 2) {
                        Q0.a.X(i8, parcel);
                    } else {
                        arrayListR = Q0.a.r(parcel, i8, AccountChangeEvent.CREATOR);
                    }
                }
                Q0.a.y(iA1, parcel);
                return new AccountChangeEventsResponse(arrayListR, iN3);
            case 2:
                return new IcyHeaders(parcel);
            case 3:
                return new IcyInfo(parcel);
            case 4:
                return new ApicFrame(parcel);
            case 5:
                return new BinaryFrame(parcel);
            case 6:
                return new ChapterFrame(parcel);
            case 7:
                return new ChapterTocFrame(parcel);
            case 8:
                return new CommentFrame(parcel);
            case 9:
                return new GeobFrame(parcel);
            case 10:
                return new InternalFrame(parcel);
            case 11:
                return new MlltFrame(parcel);
            case 12:
                return new PrivFrame(parcel);
            case 13:
                return new TextInformationFrame(parcel);
            case 14:
                return new UrlLinkFrame(parcel);
            case 15:
                return new MdtaMetadataEntry(parcel);
            case 16:
                return new MotionPhotoMetadata(parcel);
            case 17:
                return new SmtaMetadataEntry(parcel);
            case 18:
                int iA2 = Q0.a.a0(parcel);
                HashSet hashSet = new HashSet();
                int iN4 = 0;
                ArrayList arrayListR2 = null;
                zzs zzsVar = null;
                int iN5 = 0;
                while (parcel.dataPosition() < iA2) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        iN5 = Q0.a.N(i9, parcel);
                        hashSet.add(1);
                    } else if (c7 == 2) {
                        arrayListR2 = Q0.a.r(parcel, i9, zzu.CREATOR);
                        hashSet.add(2);
                    } else if (c7 == 3) {
                        iN4 = Q0.a.N(i9, parcel);
                        hashSet.add(3);
                    } else if (c7 != 4) {
                        Q0.a.X(i9, parcel);
                    } else {
                        zzsVar = (zzs) Q0.a.m(parcel, i9, zzs.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == iA2) {
                    return new zzo(hashSet, iN5, arrayListR2, iN4, zzsVar);
                }
                throw new W(k.d(iA2, "Overread allowed size end="), parcel);
            case 19:
                int iA3 = Q0.a.a0(parcel);
                int iN6 = 0;
                ArrayList arrayListP = null;
                ArrayList arrayListP2 = null;
                ArrayList arrayListP3 = null;
                ArrayList arrayListP4 = null;
                ArrayList arrayListP5 = null;
                while (parcel.dataPosition() < iA3) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iN6 = Q0.a.N(i10, parcel);
                            break;
                        case 2:
                            arrayListP = Q0.a.p(i10, parcel);
                            break;
                        case 3:
                            arrayListP2 = Q0.a.p(i10, parcel);
                            break;
                        case 4:
                            arrayListP3 = Q0.a.p(i10, parcel);
                            break;
                        case 5:
                            arrayListP4 = Q0.a.p(i10, parcel);
                            break;
                        case 6:
                            arrayListP5 = Q0.a.p(i10, parcel);
                            break;
                        default:
                            Q0.a.X(i10, parcel);
                            break;
                    }
                }
                Q0.a.y(iA3, parcel);
                return new zzs(iN6, arrayListP, arrayListP2, arrayListP3, arrayListP4, arrayListP5);
            case 20:
                int iA4 = Q0.a.a0(parcel);
                HashSet hashSet2 = new HashSet();
                zzw zzwVar = null;
                String strN2 = null;
                String strN3 = null;
                String strN4 = null;
                int iN7 = 0;
                while (parcel.dataPosition() < iA4) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iN7 = Q0.a.N(i11, parcel);
                        hashSet2.add(1);
                    } else if (c8 == 2) {
                        zzwVar = (zzw) Q0.a.m(parcel, i11, zzw.CREATOR);
                        hashSet2.add(2);
                    } else if (c8 == 3) {
                        strN2 = Q0.a.n(i11, parcel);
                        hashSet2.add(3);
                    } else if (c8 == 4) {
                        strN3 = Q0.a.n(i11, parcel);
                        hashSet2.add(4);
                    } else if (c8 != 5) {
                        Q0.a.X(i11, parcel);
                    } else {
                        strN4 = Q0.a.n(i11, parcel);
                        hashSet2.add(5);
                    }
                }
                if (parcel.dataPosition() == iA4) {
                    return new zzu(hashSet2, iN7, zzwVar, strN2, strN3, strN4);
                }
                throw new W(k.d(iA4, "Overread allowed size end="), parcel);
            case zzbbd.zzt.zzm /* 21 */:
                int iA5 = Q0.a.a0(parcel);
                HashSet hashSet3 = new HashSet();
                int iN8 = 0;
                String strN5 = null;
                byte[] bArrK = null;
                PendingIntent pendingIntent = null;
                DeviceMetaData deviceMetaData = null;
                int iN9 = 0;
                while (parcel.dataPosition() < iA5) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iN9 = Q0.a.N(i12, parcel);
                            hashSet3.add(1);
                            break;
                        case 2:
                            strN5 = Q0.a.n(i12, parcel);
                            hashSet3.add(2);
                            break;
                        case 3:
                            iN8 = Q0.a.N(i12, parcel);
                            hashSet3.add(3);
                            break;
                        case 4:
                            bArrK = Q0.a.k(i12, parcel);
                            hashSet3.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) Q0.a.m(parcel, i12, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            break;
                        case 6:
                            deviceMetaData = (DeviceMetaData) Q0.a.m(parcel, i12, DeviceMetaData.CREATOR);
                            hashSet3.add(6);
                            break;
                        default:
                            Q0.a.X(i12, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == iA5) {
                    return new zzw(hashSet3, iN9, strN5, iN8, bArrK, pendingIntent, deviceMetaData);
                }
                throw new W(k.d(iA5, "Overread allowed size end="), parcel);
            case 22:
                int iA6 = Q0.a.a0(parcel);
                int iN10 = 0;
                boolean zK = false;
                boolean zK2 = false;
                long jP = 0;
                while (parcel.dataPosition() < iA6) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        iN10 = Q0.a.N(i13, parcel);
                    } else if (c9 == 2) {
                        zK = Q0.a.K(i13, parcel);
                    } else if (c9 == 3) {
                        jP = Q0.a.P(i13, parcel);
                    } else if (c9 != 4) {
                        Q0.a.X(i13, parcel);
                    } else {
                        zK2 = Q0.a.K(i13, parcel);
                    }
                }
                Q0.a.y(iA6, parcel);
                return new DeviceMetaData(iN10, zK, jP, zK2);
            case 23:
                return new PrivateCommand(parcel);
            case 24:
                return new SpliceInsertCommand(parcel);
            case 25:
                return new SpliceNullCommand();
            case 26:
                return new SpliceScheduleCommand(parcel);
            case 27:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            case 28:
                int iA7 = Q0.a.a0(parcel);
                String strN6 = null;
                String strN7 = null;
                Uri uri = null;
                ArrayList arrayListR3 = null;
                String strN8 = null;
                String strN9 = null;
                String strN10 = null;
                String strN11 = null;
                while (parcel.dataPosition() < iA7) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strN6 = Q0.a.n(i14, parcel);
                            break;
                        case 2:
                            strN7 = Q0.a.n(i14, parcel);
                            break;
                        case 3:
                            uri = (Uri) Q0.a.m(parcel, i14, Uri.CREATOR);
                            break;
                        case 4:
                            arrayListR3 = Q0.a.r(parcel, i14, IdToken.CREATOR);
                            break;
                        case 5:
                            strN8 = Q0.a.n(i14, parcel);
                            break;
                        case 6:
                            strN9 = Q0.a.n(i14, parcel);
                            break;
                        case 7:
                        case '\b':
                        default:
                            Q0.a.X(i14, parcel);
                            break;
                        case '\t':
                            strN10 = Q0.a.n(i14, parcel);
                            break;
                        case '\n':
                            strN11 = Q0.a.n(i14, parcel);
                            break;
                    }
                }
                Q0.a.y(iA7, parcel);
                return new Credential(strN6, strN7, uri, arrayListR3, strN8, strN9, strN10, strN11);
            default:
                int iA8 = Q0.a.a0(parcel);
                int iN11 = 0;
                boolean zK3 = false;
                boolean zK4 = false;
                boolean zK5 = false;
                int iN12 = 0;
                while (parcel.dataPosition() < iA8) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        zK3 = Q0.a.K(i15, parcel);
                    } else if (c10 == 2) {
                        zK4 = Q0.a.K(i15, parcel);
                    } else if (c10 == 3) {
                        zK5 = Q0.a.K(i15, parcel);
                    } else if (c10 == 4) {
                        iN12 = Q0.a.N(i15, parcel);
                    } else if (c10 != 1000) {
                        Q0.a.X(i15, parcel);
                    } else {
                        iN11 = Q0.a.N(i15, parcel);
                    }
                }
                Q0.a.y(iA8, parcel);
                return new CredentialPickerConfig(iN11, zK3, zK4, zK5, iN12);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f6637a) {
            case 0:
                return new AccountChangeEventsRequest[i7];
            case 1:
                return new AccountChangeEventsResponse[i7];
            case 2:
                return new IcyHeaders[i7];
            case 3:
                return new IcyInfo[i7];
            case 4:
                return new ApicFrame[i7];
            case 5:
                return new BinaryFrame[i7];
            case 6:
                return new ChapterFrame[i7];
            case 7:
                return new ChapterTocFrame[i7];
            case 8:
                return new CommentFrame[i7];
            case 9:
                return new GeobFrame[i7];
            case 10:
                return new InternalFrame[i7];
            case 11:
                return new MlltFrame[i7];
            case 12:
                return new PrivFrame[i7];
            case 13:
                return new TextInformationFrame[i7];
            case 14:
                return new UrlLinkFrame[i7];
            case 15:
                return new MdtaMetadataEntry[i7];
            case 16:
                return new MotionPhotoMetadata[i7];
            case 17:
                return new SmtaMetadataEntry[i7];
            case 18:
                return new zzo[i7];
            case 19:
                return new zzs[i7];
            case 20:
                return new zzu[i7];
            case zzbbd.zzt.zzm /* 21 */:
                return new zzw[i7];
            case 22:
                return new DeviceMetaData[i7];
            case 23:
                return new PrivateCommand[i7];
            case 24:
                return new SpliceInsertCommand[i7];
            case 25:
                return new SpliceNullCommand[i7];
            case 26:
                return new SpliceScheduleCommand[i7];
            case 27:
                return new TimeSignalCommand[i7];
            case 28:
                return new Credential[i7];
            default:
                return new CredentialPickerConfig[i7];
        }
    }
}
