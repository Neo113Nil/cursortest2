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
import e1.k;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6637a;

    public /* synthetic */ a(int i7) {
        this.f6637a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6637a) {
            case 0:
                int a02 = Q0.a.a0(parcel);
                int i7 = 0;
                String str = null;
                Account account = null;
                int i8 = 0;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        i7 = Q0.a.N(readInt, parcel);
                    } else if (c3 == 2) {
                        i8 = Q0.a.N(readInt, parcel);
                    } else if (c3 == 3) {
                        str = Q0.a.n(readInt, parcel);
                    } else if (c3 != 4) {
                        Q0.a.X(readInt, parcel);
                    } else {
                        account = (Account) Q0.a.m(parcel, readInt, Account.CREATOR);
                    }
                }
                Q0.a.y(a02, parcel);
                return new AccountChangeEventsRequest(i7, i8, str, account);
            case 1:
                int a03 = Q0.a.a0(parcel);
                int i9 = 0;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        i9 = Q0.a.N(readInt2, parcel);
                    } else if (c4 != 2) {
                        Q0.a.X(readInt2, parcel);
                    } else {
                        arrayList = Q0.a.r(parcel, readInt2, AccountChangeEvent.CREATOR);
                    }
                }
                Q0.a.y(a03, parcel);
                return new AccountChangeEventsResponse(arrayList, i9);
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
                int a04 = Q0.a.a0(parcel);
                HashSet hashSet = new HashSet();
                int i10 = 0;
                ArrayList arrayList2 = null;
                zzs zzsVar = null;
                int i11 = 0;
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    char c7 = (char) readInt3;
                    if (c7 == 1) {
                        i11 = Q0.a.N(readInt3, parcel);
                        hashSet.add(1);
                    } else if (c7 == 2) {
                        arrayList2 = Q0.a.r(parcel, readInt3, zzu.CREATOR);
                        hashSet.add(2);
                    } else if (c7 == 3) {
                        i10 = Q0.a.N(readInt3, parcel);
                        hashSet.add(3);
                    } else if (c7 != 4) {
                        Q0.a.X(readInt3, parcel);
                    } else {
                        zzsVar = (zzs) Q0.a.m(parcel, readInt3, zzs.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == a04) {
                    return new zzo(hashSet, i11, arrayList2, i10, zzsVar);
                }
                throw new W(k.d(a04, "Overread allowed size end="), parcel);
            case 19:
                int a05 = Q0.a.a0(parcel);
                int i12 = 0;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < a05) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i12 = Q0.a.N(readInt4, parcel);
                            break;
                        case 2:
                            arrayList3 = Q0.a.p(readInt4, parcel);
                            break;
                        case 3:
                            arrayList4 = Q0.a.p(readInt4, parcel);
                            break;
                        case 4:
                            arrayList5 = Q0.a.p(readInt4, parcel);
                            break;
                        case 5:
                            arrayList6 = Q0.a.p(readInt4, parcel);
                            break;
                        case 6:
                            arrayList7 = Q0.a.p(readInt4, parcel);
                            break;
                        default:
                            Q0.a.X(readInt4, parcel);
                            break;
                    }
                }
                Q0.a.y(a05, parcel);
                return new zzs(i12, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
            case 20:
                int a06 = Q0.a.a0(parcel);
                HashSet hashSet2 = new HashSet();
                zzw zzwVar = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                int i13 = 0;
                while (parcel.dataPosition() < a06) {
                    int readInt5 = parcel.readInt();
                    char c8 = (char) readInt5;
                    if (c8 == 1) {
                        i13 = Q0.a.N(readInt5, parcel);
                        hashSet2.add(1);
                    } else if (c8 == 2) {
                        zzwVar = (zzw) Q0.a.m(parcel, readInt5, zzw.CREATOR);
                        hashSet2.add(2);
                    } else if (c8 == 3) {
                        str2 = Q0.a.n(readInt5, parcel);
                        hashSet2.add(3);
                    } else if (c8 == 4) {
                        str3 = Q0.a.n(readInt5, parcel);
                        hashSet2.add(4);
                    } else if (c8 != 5) {
                        Q0.a.X(readInt5, parcel);
                    } else {
                        str4 = Q0.a.n(readInt5, parcel);
                        hashSet2.add(5);
                    }
                }
                if (parcel.dataPosition() == a06) {
                    return new zzu(hashSet2, i13, zzwVar, str2, str3, str4);
                }
                throw new W(k.d(a06, "Overread allowed size end="), parcel);
            case zzbbd.zzt.zzm /* 21 */:
                int a07 = Q0.a.a0(parcel);
                HashSet hashSet3 = new HashSet();
                int i14 = 0;
                String str5 = null;
                byte[] bArr = null;
                PendingIntent pendingIntent = null;
                DeviceMetaData deviceMetaData = null;
                int i15 = 0;
                while (parcel.dataPosition() < a07) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i15 = Q0.a.N(readInt6, parcel);
                            hashSet3.add(1);
                            break;
                        case 2:
                            str5 = Q0.a.n(readInt6, parcel);
                            hashSet3.add(2);
                            break;
                        case 3:
                            i14 = Q0.a.N(readInt6, parcel);
                            hashSet3.add(3);
                            break;
                        case 4:
                            bArr = Q0.a.k(readInt6, parcel);
                            hashSet3.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) Q0.a.m(parcel, readInt6, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            break;
                        case 6:
                            deviceMetaData = (DeviceMetaData) Q0.a.m(parcel, readInt6, DeviceMetaData.CREATOR);
                            hashSet3.add(6);
                            break;
                        default:
                            Q0.a.X(readInt6, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == a07) {
                    return new zzw(hashSet3, i15, str5, i14, bArr, pendingIntent, deviceMetaData);
                }
                throw new W(k.d(a07, "Overread allowed size end="), parcel);
            case 22:
                int a08 = Q0.a.a0(parcel);
                int i16 = 0;
                boolean z4 = false;
                boolean z7 = false;
                long j = 0;
                while (parcel.dataPosition() < a08) {
                    int readInt7 = parcel.readInt();
                    char c9 = (char) readInt7;
                    if (c9 == 1) {
                        i16 = Q0.a.N(readInt7, parcel);
                    } else if (c9 == 2) {
                        z4 = Q0.a.K(readInt7, parcel);
                    } else if (c9 == 3) {
                        j = Q0.a.P(readInt7, parcel);
                    } else if (c9 != 4) {
                        Q0.a.X(readInt7, parcel);
                    } else {
                        z7 = Q0.a.K(readInt7, parcel);
                    }
                }
                Q0.a.y(a08, parcel);
                return new DeviceMetaData(i16, z4, j, z7);
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
                int a09 = Q0.a.a0(parcel);
                String str6 = null;
                String str7 = null;
                Uri uri = null;
                ArrayList arrayList8 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < a09) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str6 = Q0.a.n(readInt8, parcel);
                            break;
                        case 2:
                            str7 = Q0.a.n(readInt8, parcel);
                            break;
                        case 3:
                            uri = (Uri) Q0.a.m(parcel, readInt8, Uri.CREATOR);
                            break;
                        case 4:
                            arrayList8 = Q0.a.r(parcel, readInt8, IdToken.CREATOR);
                            break;
                        case 5:
                            str8 = Q0.a.n(readInt8, parcel);
                            break;
                        case 6:
                            str9 = Q0.a.n(readInt8, parcel);
                            break;
                        case 7:
                        case '\b':
                        default:
                            Q0.a.X(readInt8, parcel);
                            break;
                        case '\t':
                            str10 = Q0.a.n(readInt8, parcel);
                            break;
                        case '\n':
                            str11 = Q0.a.n(readInt8, parcel);
                            break;
                    }
                }
                Q0.a.y(a09, parcel);
                return new Credential(str6, str7, uri, arrayList8, str8, str9, str10, str11);
            default:
                int a010 = Q0.a.a0(parcel);
                int i17 = 0;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                int i18 = 0;
                while (parcel.dataPosition() < a010) {
                    int readInt9 = parcel.readInt();
                    char c10 = (char) readInt9;
                    if (c10 == 1) {
                        z8 = Q0.a.K(readInt9, parcel);
                    } else if (c10 == 2) {
                        z9 = Q0.a.K(readInt9, parcel);
                    } else if (c10 == 3) {
                        z10 = Q0.a.K(readInt9, parcel);
                    } else if (c10 == 4) {
                        i18 = Q0.a.N(readInt9, parcel);
                    } else if (c10 != 1000) {
                        Q0.a.X(readInt9, parcel);
                    } else {
                        i17 = Q0.a.N(readInt9, parcel);
                    }
                }
                Q0.a.y(a010, parcel);
                return new CredentialPickerConfig(i17, z8, z9, z10, i18);
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
