package com.ryanheise.audioservice;

import A1.AbstractC0013d;
import A1.K0;
import F.q;
import F.w;
import G4.C0286t;
import I4.j;
import N.b;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.h;
import android.support.v4.media.session.o;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.KeyEvent;
import androidx.datastore.preferences.protobuf.C0665j;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p028d6.k;
import p049g5.a;
import p049g5.c;
import p049g5.i;
import p049g5.l;
import p049g5.m;
import p083l4.x;
import p117q0.n;
import p117q0.s;
import p117q0.y;
import p136t.e;
import p155w1.C1010l1;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public class AudioService extends s {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static AudioService f12300P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static PendingIntent f12301Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static j f12302R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static ArrayList f12303S = new ArrayList();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final HashMap f12304T = new HashMap();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PowerManager.WakeLock f12305A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public t f12306B;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int[] f12310F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public MediaMetadataCompat f12311G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Bitmap f12312H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f12313I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public a f12314J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f12316L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0665j f12318N;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c f12320z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f12307C = new ArrayList();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f12308D = new ArrayList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f12309E = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f12315K = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f12319O = 1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Handler f12317M = new Handler(Looper.getMainLooper());

    @Override // p117q0.s
    public final k b(Bundle bundle) {
        Bundle bundle2 = null;
        Boolean boolValueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (boolValueOf == null) {
            boolValueOf = Boolean.FALSE;
        }
        c cVar = this.f12320z;
        if (cVar.f13250o != null) {
            try {
                JSONObject jSONObject = new JSONObject(cVar.f13250o);
                Bundle bundle3 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        try {
                            try {
                                try {
                                    bundle3.putInt(next, jSONObject.getInt(next));
                                } catch (Exception unused) {
                                    bundle3.putString(next, jSONObject.getString(next));
                                }
                            } catch (Exception unused2) {
                                bundle3.putBoolean(next, jSONObject.getBoolean(next));
                            }
                        } catch (Exception unused3) {
                            System.out.println("Unsupported extras value for key " + next);
                        }
                    } catch (Exception unused4) {
                        bundle3.putDouble(next, jSONObject.getDouble(next));
                    }
                }
                bundle2 = bundle3;
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        return new k(13, boolValueOf.booleanValue() ? "recent" : "root", bundle2);
    }

    @Override // p117q0.s
    public final void c(String str, n nVar, Bundle bundle) {
        if (f12302R == null) {
            nVar.e(new ArrayList());
            return;
        }
        if (l.f13281z != null) {
            HashMap mapM = p031e1.k.m("parentMediaId", str);
            mapM.put(RRWebOptionsEvent.EVENT_TAG, l.e(bundle));
            l.f13281z.g("getChildren", mapM, new i(nVar, 0));
        }
        nVar.a();
    }

    @Override // p117q0.s
    public final void d(String str, n nVar) {
        if (f12302R == null) {
            nVar.e(null);
            return;
        }
        if (l.f13281z != null) {
            l.f13281z.g("getMediaItem", p031e1.k.m("mediaId", str), new i(nVar, 1));
        }
        nVar.a();
    }

    public final PendingIntent f(long j) {
        int i7;
        if (j == 4) {
            i7 = 91;
        } else if (j == 2) {
            i7 = 130;
        } else if (j == 4) {
            i7 = 126;
        } else if (j == 2) {
            i7 = 127;
        } else if (j == 32) {
            i7 = 87;
        } else if (j == 16) {
            i7 = 88;
        } else if (j == 1) {
            i7 = 86;
        } else if (j == 64) {
            i7 = 90;
        } else if (j == 8) {
            i7 = 89;
        } else {
            i7 = j == 512 ? 85 : 0;
        }
        if (i7 == 0) {
            return null;
        }
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i7));
        return PendingIntent.getBroadcast(this, i7, intent, 67108864);
    }

    public final Notification g() {
        int[] iArr = this.f12310F;
        if (iArr == null) {
            int iMin = Math.min(3, this.f12308D.size());
            int[] iArr2 = new int[iMin];
            for (int i7 = 0; i7 < iMin; i7++) {
                iArr2[i7] = i7;
            }
            iArr = iArr2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager.getNotificationChannel(this.f12313I) == null) {
                AbstractC0013d.D();
                NotificationChannel notificationChannelF = b.f(this.f12313I, this.f12320z.f13240d);
                notificationChannelF.setShowBadge(this.f12320z.f13244h);
                String str = this.f12320z.f13241e;
                if (str != null) {
                    notificationChannelF.setDescription(str);
                }
                notificationManager.createNotificationChannel(notificationChannelF);
            }
        }
        w wVar = new w(this, this.f12313I);
        wVar.f2470p = 1;
        wVar.j = false;
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        wVar.f2473s.deleteIntent = PendingIntent.getBroadcast(this, 0, intent, 67108864);
        wVar.f2473s.icon = i(this.f12320z.f13243g);
        MediaMetadataCompat mediaMetadataCompat = this.f12311G;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat mediaDescriptionCompatA = mediaMetadataCompat.a();
            CharSequence charSequence = mediaDescriptionCompatA.f7979b;
            if (charSequence != null) {
                wVar.f2460e = w.b(charSequence);
            }
            CharSequence charSequence2 = mediaDescriptionCompatA.f7980c;
            if (charSequence2 != null) {
                wVar.f2461f = w.b(charSequence2);
            }
            CharSequence charSequence3 = mediaDescriptionCompatA.f7981d;
            if (charSequence3 != null) {
                wVar.f2466l = w.b(charSequence3);
            }
            synchronized (this) {
                try {
                    Bitmap bitmap = this.f12312H;
                    if (bitmap != null) {
                        wVar.d(bitmap);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.f12320z.f13245i) {
            wVar.f2462g = ((h) ((C1050x1) this.f12306B.f8077c).f17931b).f8047a.getSessionActivity();
        }
        int i8 = this.f12320z.f13242f;
        if (i8 != -1) {
            wVar.f2469o = i8;
        }
        for (q qVar : this.f12308D) {
            if (qVar != null) {
                wVar.f2457b.add(qVar);
            }
        }
        p123r0.c cVar = new p123r0.c();
        cVar.f16018c = null;
        cVar.f16019d = ((o) this.f12306B.f8076b).f8062c;
        if (Build.VERSION.SDK_INT < 33) {
            cVar.f16018c = iArr;
        }
        if (this.f12320z.j) {
            f(1L);
            wVar.c(2);
        }
        wVar.e(cVar);
        return wVar.a();
    }

    public final void h(c cVar) {
        this.f12320z = cVar;
        String str = cVar.f13239c;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.f12313I = str;
        if (cVar.f13249n != null) {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent((String) null);
            intent.setComponent(new ComponentName(applicationContext, cVar.f13249n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            f12301Q = PendingIntent.getActivity(applicationContext, zzbbd.zzq.zzf, intent, 201326592);
        } else {
            f12301Q = null;
        }
        if (cVar.f13238b) {
            return;
        }
        ((o) this.f12306B.f8076b).f8060a.setMediaButtonReceiver(null);
    }

    public final int i(String str) {
        String[] strArrSplit = str.split("/");
        String str2 = strArrSplit[0];
        return getResources().getIdentifier(strArrSplit[1], str2, getApplicationContext().getPackageName());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[Catch: Exception -> 0x003d, FileNotFoundException | IOException -> 0x0065, TryCatch #0 {Exception -> 0x003d, blocks: (B:6:0x000c, B:10:0x001f, B:12:0x0025, B:14:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004a, B:23:0x0054, B:25:0x0060, B:54:0x00c8, B:31:0x006b, B:33:0x0071, B:35:0x007b, B:37:0x0086, B:46:0x00a3, B:48:0x00aa, B:50:0x00b0, B:40:0x0094, B:41:0x0098, B:43:0x009c, B:45:0x00a0, B:36:0x007f, B:52:0x00bb, B:53:0x00c0), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[Catch: Exception -> 0x003d, FileNotFoundException | IOException -> 0x0065, TRY_LEAVE, TryCatch #0 {Exception -> 0x003d, blocks: (B:6:0x000c, B:10:0x001f, B:12:0x0025, B:14:0x0038, B:17:0x0040, B:19:0x0046, B:20:0x004a, B:23:0x0054, B:25:0x0060, B:54:0x00c8, B:31:0x006b, B:33:0x0071, B:35:0x007b, B:37:0x0086, B:46:0x00a3, B:48:0x00aa, B:50:0x00b0, B:40:0x0094, B:41:0x0098, B:43:0x009c, B:45:0x00a0, B:36:0x007f, B:52:0x00bb, B:53:0x00c0), top: B:59:0x000c }] */
    public final Bitmap j(String str, String str2) {
        FileDescriptor fileDescriptor;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        Bitmap bitmapDecodeFileDescriptor = (Bitmap) this.f12314J.get(str);
        if (bitmapDecodeFileDescriptor != null) {
            return bitmapDecodeFileDescriptor;
        }
        try {
            Uri uri = Uri.parse(str);
            boolean zEquals = "content".equals(uri.getScheme());
            if (!zEquals) {
                fileDescriptor = null;
            } else {
                if (str2 == null) {
                    parcelFileDescriptorOpenFileDescriptor = getContentResolver().openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                    }
                    return null;
                }
                try {
                    if (Build.VERSION.SDK_INT < 29) {
                        parcelFileDescriptorOpenFileDescriptor = getContentResolver().openFileDescriptor(uri, "r");
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                        }
                        return null;
                    }
                    Size size = new Size(192, 192);
                    ContentResolver contentResolver = getContentResolver();
                    int width = this.f12320z.f13247l;
                    if (width == -1) {
                        width = size.getWidth();
                    }
                    int height = this.f12320z.f13248m;
                    if (height == -1) {
                        height = size.getHeight();
                    }
                    bitmapDecodeFileDescriptor = contentResolver.loadThumbnail(uri, new Size(width, height), null);
                    if (bitmapDecodeFileDescriptor == null) {
                        return null;
                    }
                    fileDescriptor = null;
                } catch (FileNotFoundException | IOException unused) {
                }
            }
            if (!zEquals || fileDescriptor != null) {
                if (this.f12320z.f13247l != -1) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    int i7 = 1;
                    options.inJustDecodeBounds = true;
                    if (fileDescriptor != null) {
                        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    } else {
                        BitmapFactory.decodeFile(uri.getPath(), options);
                    }
                    c cVar = this.f12320z;
                    int i8 = cVar.f13247l;
                    int i9 = cVar.f13248m;
                    int i10 = options.outHeight;
                    int i11 = options.outWidth;
                    if (i10 > i9 || i11 > i8) {
                        int i12 = i10 / 2;
                        int i13 = i11 / 2;
                        while (i12 / i7 >= i9 && i13 / i7 >= i8) {
                            i7 *= 2;
                        }
                    }
                    options.inSampleSize = i7;
                    options.inJustDecodeBounds = false;
                    bitmapDecodeFileDescriptor = fileDescriptor != null ? BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options) : BitmapFactory.decodeFile(uri.getPath(), options);
                } else {
                    bitmapDecodeFileDescriptor = fileDescriptor != null ? BitmapFactory.decodeFileDescriptor(fileDescriptor) : BitmapFactory.decodeFile(uri.getPath());
                }
            }
            this.f12314J.put(str, bitmapDecodeFileDescriptor);
            return bitmapDecodeFileDescriptor;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public final synchronized void k(MediaMetadataCompat mediaMetadataCompat) {
        try {
            String strB = mediaMetadataCompat.b("artCacheFile");
            if (strB != null) {
                this.f12312H = j(strB, null);
                C1010l1 c1010l1 = new C1010l1(mediaMetadataCompat);
                c1010l1.C("android.media.metadata.ALBUM_ART", this.f12312H);
                c1010l1.C("android.media.metadata.DISPLAY_ICON", this.f12312H);
                mediaMetadataCompat = new MediaMetadataCompat((Bundle) c1010l1.f17777a);
            } else {
                String strB2 = mediaMetadataCompat.b("android.media.metadata.DISPLAY_ICON_URI");
                if (strB2 == null || !strB2.startsWith("content:")) {
                    this.f12312H = null;
                } else {
                    this.f12312H = j(strB2, mediaMetadataCompat.b("loadThumbnailUri"));
                    C1010l1 c1010l2 = new C1010l1(mediaMetadataCompat);
                    c1010l2.C("android.media.metadata.ALBUM_ART", this.f12312H);
                    c1010l2.C("android.media.metadata.DISPLAY_ICON", this.f12312H);
                    mediaMetadataCompat = new MediaMetadataCompat((Bundle) c1010l2.f17777a);
                }
            }
            this.f12311G = mediaMetadataCompat;
            o oVar = (o) this.f12306B.f8076b;
            oVar.f8067h = mediaMetadataCompat;
            if (mediaMetadataCompat.f7992b == null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompat.f7992b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
            }
            oVar.f8060a.setMetadata(mediaMetadataCompat.f7992b);
            this.f12317M.removeCallbacksAndMessages(null);
            this.f12317M.post(new K0(this, 26));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    public final void l(int i7, Integer num, Integer num2, Integer num3) {
        if (i7 == 1) {
            o oVar = (o) this.f12306B.f8076b;
            oVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            oVar.f8060a.setPlaybackToLocal(builder.build());
            this.f12318N = null;
            return;
        }
        if (i7 == 2) {
            if (this.f12318N == null || num.intValue() != this.f12318N.f9210b) {
                this.f12318N = new C0665j(num.intValue(), num2.intValue(), num3.intValue());
            } else {
                int iIntValue = num2.intValue();
                C0665j c0665j = this.f12318N;
                if (iIntValue != c0665j.f9211c) {
                    this.f12318N = new C0665j(num.intValue(), num2.intValue(), num3.intValue());
                } else {
                    int iIntValue2 = num3.intValue();
                    c0665j.f9212d = iIntValue2;
                    y.a(c0665j.b(), iIntValue2);
                }
            }
            t tVar = this.f12306B;
            C0665j c0665j2 = this.f12318N;
            if (c0665j2 == null) {
                tVar.getClass();
                throw new IllegalArgumentException("volumeProvider may not be null!");
            }
            o oVar2 = (o) tVar.f8076b;
            oVar2.getClass();
            oVar2.f8060a.setPlaybackToRemote(c0665j2.b());
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f1 A[LOOP:2: B:109:0x01e3->B:113:0x01f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x0206  */
    /* JADX WARN: Code duplicated, block: B:124:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0218  */
    /* JADX WARN: Code duplicated, block: B:126:0x021c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0224  */
    /* JADX WARN: Code duplicated, block: B:132:0x0258  */
    /* JADX WARN: Code duplicated, block: B:136:0x0267 A[Catch: all -> 0x0273, TRY_LEAVE, TryCatch #0 {, blocks: (B:134:0x025d, B:136:0x0267, B:137:0x026f, B:142:0x0278, B:143:0x027d), top: B:214:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:149:0x028b  */
    /* JADX WARN: Code duplicated, block: B:153:0x029a A[Catch: all -> 0x02a6, TRY_LEAVE, TryCatch #2 {, blocks: (B:151:0x0290, B:153:0x029a, B:154:0x02a2, B:159:0x02ab, B:160:0x02b0), top: B:218:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cf A[Catch: all -> 0x02db, TRY_LEAVE, TryCatch #4 {, blocks: (B:168:0x02c5, B:170:0x02cf, B:171:0x02d7, B:176:0x02e0, B:177:0x02e5), top: B:222:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x02ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x032d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x032f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x0342  */
    /* JADX WARN: Code duplicated, block: B:200:0x034a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0290 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x016e  */
    public final void m(ArrayList arrayList, long j, int[] iArr, int i7, boolean z4, long j3, long j7, float f7, long j8, Integer num, String str, int i8, int i9, boolean z7, Long l7) {
        int i10;
        int i11;
        long jLongValue;
        String str2;
        int i12;
        int iIntValue;
        o oVar;
        o oVar2;
        o oVar3;
        int iBeginBroadcast;
        int iBeginBroadcast2;
        int iBeginBroadcast3;
        Iterator it;
        boolean z8;
        PlaybackStateCompat.CustomAction customAction;
        Bundle bundle;
        boolean z9 = !Arrays.equals(iArr, this.f12310F);
        if (!arrayList.equals(this.f12307C)) {
            z9 = true;
        }
        this.f12307C = arrayList;
        this.f12308D.clear();
        this.f12309E.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p049g5.n nVar = (p049g5.n) it2.next();
            int i13 = i(nVar.f13290a);
            String str3 = nVar.f13291b;
            m mVar = nVar.f13293d;
            if (mVar != null) {
                it = it2;
                String str4 = mVar.f13288a;
                if (TextUtils.isEmpty(str4)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(str3)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i13 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                Map map = mVar.f13289b;
                if (map == null) {
                    z8 = z9;
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    Iterator it3 = map.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        String string = entry.getKey().toString();
                        Object value = entry.getValue();
                        Iterator it4 = it3;
                        if (value instanceof Integer) {
                            bundle.putInt(string, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(string, ((Long) value).longValue());
                        } else {
                            bundle.putString(string, value.toString());
                        }
                        z9 = z9;
                        it3 = it4;
                    }
                    z8 = z9;
                }
                customAction = new PlaybackStateCompat.CustomAction(str4, str3, i13, bundle);
            } else {
                it = it2;
                z8 = z9;
                if (Build.VERSION.SDK_INT >= 33) {
                    long j9 = nVar.f13292c;
                    if (j9 == 1) {
                        if (TextUtils.isEmpty("com.ryanheise.audioservice.action.STOP")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i13 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        customAction = new PlaybackStateCompat.CustomAction("com.ryanheise.audioservice.action.STOP", str3, i13, null);
                    } else if (j9 == 64) {
                        if (TextUtils.isEmpty("com.ryanheise.audioservice.action.FAST_FORWARD")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i13 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        customAction = new PlaybackStateCompat.CustomAction("com.ryanheise.audioservice.action.FAST_FORWARD", str3, i13, null);
                    } else if (j9 != 8) {
                        customAction = null;
                    } else {
                        if (TextUtils.isEmpty("com.ryanheise.audioservice.action.REWIND")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i13 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        customAction = new PlaybackStateCompat.CustomAction("com.ryanheise.audioservice.action.REWIND", str3, i13, null);
                    }
                } else {
                    customAction = null;
                }
            }
            if (customAction != null) {
                this.f12309E.add(customAction);
            } else {
                this.f12308D.add(new q(i(nVar.f13290a), nVar.f13291b, f(nVar.f13292c)));
            }
            z9 = z8;
            it2 = it;
        }
        boolean z10 = z9;
        Bundle bundle2 = null;
        this.f12310F = iArr;
        boolean z11 = this.f12315K;
        int i14 = this.f12319O;
        this.f12319O = i7;
        this.f12315K = z4;
        ArrayList arrayList2 = new ArrayList();
        long j10 = j | 3669711;
        int iE = e.e(this.f12319O);
        if (iE != 1) {
            int i15 = 2;
            if (iE != 2) {
                if (iE == 3) {
                    if (this.f12315K) {
                        i15 = 3;
                    }
                    i11 = i15;
                } else if (iE == 4) {
                    if (this.f12315K) {
                        i15 = 3;
                    }
                    i11 = i15;
                } else if (iE != 5) {
                    i11 = 0;
                } else {
                    i10 = 7;
                }
                for (PlaybackStateCompat.CustomAction customAction2 : this.f12309E) {
                    if (customAction2 != null) {
                        throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
                    }
                    arrayList2.add(customAction2);
                }
                if (l7 != null) {
                    jLongValue = l7.longValue();
                } else {
                    jLongValue = -1;
                }
                long j11 = jLongValue;
                if (num != null || str == null) {
                    if (str != null) {
                        iIntValue = -987654;
                    } else {
                        str2 = null;
                        i12 = 0;
                    }
                    if (this.f12311G != null) {
                        bundle2 = new Bundle();
                        bundle2.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", this.f12311G.a().f7978a);
                    }
                    this.f12306B.y0(new PlaybackStateCompat(i11, j3, j7, f7, j10, i12, str2, j8, arrayList2, j11, bundle2));
                    oVar = (o) this.f12306B.f8076b;
                    if (oVar.j != i8) {
                        oVar.j = i8;
                        synchronized (oVar.f8063d) {
                            for (iBeginBroadcast3 = oVar.f8064e.beginBroadcast() - 1; iBeginBroadcast3 >= 0; iBeginBroadcast3--) {
                                try {
                                    ((android.support.v4.media.session.b) oVar.f8064e.getBroadcastItem(iBeginBroadcast3)).b(i8);
                                } catch (RemoteException unused) {
                                }
                            }
                            oVar.f8064e.finishBroadcast();
                        }
                    }
                    oVar2 = (o) this.f12306B.f8076b;
                    if (oVar2.f8069k != i9) {
                        oVar2.f8069k = i9;
                        synchronized (oVar2.f8063d) {
                            for (iBeginBroadcast2 = oVar2.f8064e.beginBroadcast() - 1; iBeginBroadcast2 >= 0; iBeginBroadcast2--) {
                                try {
                                    ((android.support.v4.media.session.b) oVar2.f8064e.getBroadcastItem(iBeginBroadcast2)).b0(i9);
                                } catch (RemoteException unused2) {
                                }
                            }
                            oVar2.f8064e.finishBroadcast();
                        }
                    }
                    oVar3 = (o) this.f12306B.f8076b;
                    if (oVar3.f8068i != z7) {
                        oVar3.f8068i = z7;
                        synchronized (oVar3.f8063d) {
                            for (iBeginBroadcast = oVar3.f8064e.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                                try {
                                    ((android.support.v4.media.session.b) oVar3.f8064e.getBroadcastItem(iBeginBroadcast)).F(z7);
                                } catch (RemoteException unused3) {
                                }
                            }
                            oVar3.f8064e.finishBroadcast();
                        }
                    }
                    if (z11 && z4) {
                        G.h.startForegroundService(this, new Intent(this, (Class<?>) AudioService.class));
                        if (!this.f12306B.p0()) {
                            this.f12306B.w0(true);
                        }
                        if (!this.f12305A.isHeld()) {
                            this.f12305A.acquire();
                        }
                        ((o) this.f12306B.f8076b).f8060a.setSessionActivity(f12301Q);
                        startForeground(1124, g());
                        this.f12316L = true;
                    } else if (z11 && !z4 && this.f12320z.f13246k) {
                        stopForeground(0);
                        if (this.f12305A.isHeld()) {
                            this.f12305A.release();
                        }
                    }
                    if (i14 == 1 && i7 == 1) {
                        if (this.f12306B.p0()) {
                            this.f12306B.w0(false);
                        }
                        ((NotificationManager) getSystemService("notification")).cancel(1124);
                        stopSelf();
                        return;
                    }
                    if (i7 == 1 && z10 && this.f12316L) {
                        ((NotificationManager) getSystemService("notification")).notify(1124, g());
                        return;
                    }
                    return;
                }
                iIntValue = num.intValue();
                str2 = str;
                i12 = iIntValue;
                if (this.f12311G != null) {
                    bundle2 = new Bundle();
                    bundle2.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", this.f12311G.a().f7978a);
                }
                this.f12306B.y0(new PlaybackStateCompat(i11, j3, j7, f7, j10, i12, str2, j8, arrayList2, j11, bundle2));
                oVar = (o) this.f12306B.f8076b;
                if (oVar.j != i8) {
                    oVar.j = i8;
                    synchronized (oVar.f8063d) {
                        while (iBeginBroadcast3 >= 0) {
                            ((android.support.v4.media.session.b) oVar.f8064e.getBroadcastItem(iBeginBroadcast3)).b(i8);
                        }
                        oVar.f8064e.finishBroadcast();
                    }
                }
                oVar2 = (o) this.f12306B.f8076b;
                if (oVar2.f8069k != i9) {
                    oVar2.f8069k = i9;
                    synchronized (oVar2.f8063d) {
                        while (iBeginBroadcast2 >= 0) {
                            ((android.support.v4.media.session.b) oVar2.f8064e.getBroadcastItem(iBeginBroadcast2)).b0(i9);
                        }
                        oVar2.f8064e.finishBroadcast();
                    }
                }
                oVar3 = (o) this.f12306B.f8076b;
                if (oVar3.f8068i != z7) {
                    oVar3.f8068i = z7;
                    synchronized (oVar3.f8063d) {
                        while (iBeginBroadcast >= 0) {
                            ((android.support.v4.media.session.b) oVar3.f8064e.getBroadcastItem(iBeginBroadcast)).F(z7);
                        }
                        oVar3.f8064e.finishBroadcast();
                    }
                }
                if (z11) {
                    if (z11) {
                        stopForeground(0);
                        if (this.f12305A.isHeld()) {
                            this.f12305A.release();
                        }
                    }
                } else if (z11) {
                    stopForeground(0);
                    if (this.f12305A.isHeld()) {
                        this.f12305A.release();
                    }
                }
                if (i14 == 1) {
                }
                if (i7 == 1) {
                }
            }
            i10 = 6;
        } else {
            i10 = 8;
        }
        i11 = i10;
        while (r9.hasNext()) {
            if (customAction2 != null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            arrayList2.add(customAction2);
        }
        if (l7 != null) {
            jLongValue = l7.longValue();
        } else {
            jLongValue = -1;
        }
        long j12 = jLongValue;
        if (num != null) {
            if (str != null) {
                iIntValue = -987654;
                str2 = str;
                i12 = iIntValue;
            } else {
                str2 = null;
                i12 = 0;
            }
        } else if (str != null) {
            iIntValue = -987654;
            str2 = str;
            i12 = iIntValue;
        } else {
            str2 = null;
            i12 = 0;
        }
        if (this.f12311G != null) {
            bundle2 = new Bundle();
            bundle2.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", this.f12311G.a().f7978a);
        }
        this.f12306B.y0(new PlaybackStateCompat(i11, j3, j7, f7, j10, i12, str2, j8, arrayList2, j12, bundle2));
        oVar = (o) this.f12306B.f8076b;
        if (oVar.j != i8) {
            oVar.j = i8;
            synchronized (oVar.f8063d) {
                while (iBeginBroadcast3 >= 0) {
                    ((android.support.v4.media.session.b) oVar.f8064e.getBroadcastItem(iBeginBroadcast3)).b(i8);
                }
                oVar.f8064e.finishBroadcast();
            }
        }
        oVar2 = (o) this.f12306B.f8076b;
        if (oVar2.f8069k != i9) {
            oVar2.f8069k = i9;
            synchronized (oVar2.f8063d) {
                while (iBeginBroadcast2 >= 0) {
                    ((android.support.v4.media.session.b) oVar2.f8064e.getBroadcastItem(iBeginBroadcast2)).b0(i9);
                }
                oVar2.f8064e.finishBroadcast();
            }
        }
        oVar3 = (o) this.f12306B.f8076b;
        if (oVar3.f8068i != z7) {
            oVar3.f8068i = z7;
            synchronized (oVar3.f8063d) {
                while (iBeginBroadcast >= 0) {
                    ((android.support.v4.media.session.b) oVar3.f8064e.getBroadcastItem(iBeginBroadcast)).F(z7);
                }
                oVar3.f8064e.finishBroadcast();
            }
        }
        if (z11) {
            if (z11) {
                stopForeground(0);
                if (this.f12305A.isHeld()) {
                    this.f12305A.release();
                }
            }
        } else if (z11) {
            stopForeground(0);
            if (this.f12305A.isHeld()) {
                this.f12305A.release();
            }
        }
        if (i14 == 1) {
        }
        if (i7 == 1) {
        }
    }

    @Override // p117q0.s, android.app.Service
    public final void onCreate() {
        super.onCreate();
        f12300P = this;
        this.f12316L = false;
        this.f12315K = false;
        this.f12319O = 1;
        this.f12306B = new t(this);
        h(new c(getApplicationContext()));
        ((o) this.f12306B.f8076b).f8060a.setFlags(7);
        this.f12306B.y0(new PlaybackStateCompat(0, 0L, 0L, 0.0f, 3669711L, 0, null, 0L, new ArrayList(), -1L, null));
        t tVar = this.f12306B;
        ((o) tVar.f8076b).e(new p049g5.b(this), new Handler());
        MediaSessionCompat$Token mediaSessionCompat$Token = ((o) this.f12306B.f8076b).f8062c;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f15789x != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f15789x = mediaSessionCompat$Token;
        j jVar = this.f15783a;
        ((s) jVar.f3681e).f15788f.a(new x(8, jVar, mediaSessionCompat$Token));
        this.f12306B.z0(f12303S);
        this.f12305A = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.f12314J = new a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
        l.i(this);
        System.out.println("flutterEngine warmed up");
    }

    @Override // p117q0.s, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (f12302R != null) {
            HashSet hashSet = l.f13279x;
            synchronized (l.class) {
                Iterator it = l.f13279x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        p128r5.b bVar = (p128r5.b) C0286t.b().f3024a.get("audio_service_engine");
                        if (bVar != null) {
                            bVar.a();
                            C0286t.b().c("audio_service_engine", null);
                        }
                        break;
                    }
                    if (((p049g5.j) it.next()).f13266b != null) {
                        break;
                    }
                }
            }
            f12302R = null;
        }
        this.f12311G = null;
        this.f12312H = null;
        f12303S.clear();
        f12304T.clear();
        this.f12307C.clear();
        this.f12314J.evictAll();
        this.f12310F = null;
        t tVar = this.f12306B;
        if (tVar != null) {
            if (tVar.p0()) {
                this.f12306B.w0(false);
            }
            ((NotificationManager) getSystemService("notification")).cancel(1124);
            o oVar = (o) this.f12306B.f8076b;
            oVar.f8064e.kill();
            int i7 = Build.VERSION.SDK_INT;
            MediaSession mediaSession = oVar.f8060a;
            if (i7 == 27) {
                try {
                    Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(mediaSession);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e7) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
                }
            }
            mediaSession.setCallback(null);
            oVar.f8061b.f8059a.set(null);
            mediaSession.release();
            this.f12306B = null;
        }
        stopForeground(!this.f12320z.f13238b ? 1 : 0);
        if (this.f12305A.isHeld()) {
            this.f12305A.release();
        }
        f12300P = null;
        this.f12316L = false;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        t tVar = this.f12306B;
        int i9 = MediaButtonReceiver.f12321a;
        if (tVar == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return 2;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        C1050x1 c1050x1 = (C1050x1) tVar.f8077c;
        if (keyEvent != null) {
            ((h) c1050x1.f17931b).f8047a.dispatchMediaButtonEvent(keyEvent);
            return 2;
        }
        c1050x1.getClass();
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        j jVar = f12302R;
        if (jVar != null) {
            jVar.g("onTaskRemoved", l.k(new Object[0]), null);
        }
        super.onTaskRemoved(intent);
    }
}
