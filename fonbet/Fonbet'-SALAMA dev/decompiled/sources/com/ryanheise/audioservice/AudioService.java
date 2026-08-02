package com.ryanheise.audioservice;

import A1.AbstractC0013d;
import A1.K0;
import F.q;
import F.w;
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
import androidx.datastore.preferences.protobuf.C0686j;
import com.google.android.gms.internal.ads.zzbbd;
import d6.C0977k;
import e1.k;
import g5.C1146a;
import g5.C1147b;
import g5.C1148c;
import g5.i;
import g5.l;
import g5.m;
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
import l4.x;
import org.json.JSONObject;
import q0.n;
import q0.s;
import q0.y;
import r0.C1569c;
import t.e;
import w1.C1719l1;
import w1.C1759x1;

/* loaded from: classes2.dex */
public class AudioService extends s {

    /* renamed from: P, reason: collision with root package name */
    public static AudioService f12300P;

    /* renamed from: Q, reason: collision with root package name */
    public static PendingIntent f12301Q;

    /* renamed from: R, reason: collision with root package name */
    public static j f12302R;

    /* renamed from: S, reason: collision with root package name */
    public static ArrayList f12303S = new ArrayList();

    /* renamed from: T, reason: collision with root package name */
    public static final HashMap f12304T = new HashMap();

    /* renamed from: A, reason: collision with root package name */
    public PowerManager.WakeLock f12305A;

    /* renamed from: B, reason: collision with root package name */
    public t f12306B;

    /* renamed from: F, reason: collision with root package name */
    public int[] f12310F;

    /* renamed from: G, reason: collision with root package name */
    public MediaMetadataCompat f12311G;

    /* renamed from: H, reason: collision with root package name */
    public Bitmap f12312H;

    /* renamed from: I, reason: collision with root package name */
    public String f12313I;

    /* renamed from: J, reason: collision with root package name */
    public C1146a f12314J;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12316L;

    /* renamed from: N, reason: collision with root package name */
    public C0686j f12318N;

    /* renamed from: z, reason: collision with root package name */
    public C1148c f12320z;

    /* renamed from: C, reason: collision with root package name */
    public ArrayList f12307C = new ArrayList();

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f12308D = new ArrayList();

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f12309E = new ArrayList();

    /* renamed from: K, reason: collision with root package name */
    public boolean f12315K = false;

    /* renamed from: O, reason: collision with root package name */
    public int f12319O = 1;

    /* renamed from: M, reason: collision with root package name */
    public final Handler f12317M = new Handler(Looper.getMainLooper());

    @Override // q0.s
    public final C0977k b(Bundle bundle) {
        Bundle bundle2 = null;
        Boolean valueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (valueOf == null) {
            valueOf = Boolean.FALSE;
        }
        C1148c c1148c = this.f12320z;
        if (c1148c.f13244o != null) {
            try {
                JSONObject jSONObject = new JSONObject(c1148c.f13244o);
                Bundle bundle3 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
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
        return new C0977k(13, valueOf.booleanValue() ? "recent" : "root", bundle2);
    }

    @Override // q0.s
    public final void c(String str, n nVar, Bundle bundle) {
        if (f12302R == null) {
            nVar.e(new ArrayList());
            return;
        }
        if (l.f13275z != null) {
            HashMap m7 = k.m("parentMediaId", str);
            m7.put(RRWebOptionsEvent.EVENT_TAG, l.e(bundle));
            l.f13275z.g("getChildren", m7, new i(nVar, 0));
        }
        nVar.a();
    }

    @Override // q0.s
    public final void d(String str, n nVar) {
        if (f12302R == null) {
            nVar.e(null);
            return;
        }
        if (l.f13275z != null) {
            l.f13275z.g("getMediaItem", k.m("mediaId", str), new i(nVar, 1));
        }
        nVar.a();
    }

    public final PendingIntent f(long j) {
        int i7 = j == 4 ? 91 : j == 2 ? 130 : j == 4 ? 126 : j == 2 ? 127 : j == 32 ? 87 : j == 16 ? 88 : j == 1 ? 86 : j == 64 ? 90 : j == 8 ? 89 : j == 512 ? 85 : 0;
        if (i7 == 0) {
            return null;
        }
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i7));
        return PendingIntent.getBroadcast(this, i7, intent, 67108864);
    }

    public final Notification g() {
        NotificationChannel notificationChannel;
        int[] iArr = this.f12310F;
        if (iArr == null) {
            int min = Math.min(3, this.f12308D.size());
            int[] iArr2 = new int[min];
            for (int i7 = 0; i7 < min; i7++) {
                iArr2[i7] = i7;
            }
            iArr = iArr2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationChannel = notificationManager.getNotificationChannel(this.f12313I);
            if (notificationChannel == null) {
                AbstractC0013d.D();
                NotificationChannel f7 = b.f(this.f12313I, this.f12320z.f13234d);
                f7.setShowBadge(this.f12320z.f13238h);
                String str = this.f12320z.f13235e;
                if (str != null) {
                    f7.setDescription(str);
                }
                notificationManager.createNotificationChannel(f7);
            }
        }
        w wVar = new w(this, this.f12313I);
        wVar.f2470p = 1;
        wVar.j = false;
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        wVar.f2473s.deleteIntent = PendingIntent.getBroadcast(this, 0, intent, 67108864);
        wVar.f2473s.icon = i(this.f12320z.f13237g);
        MediaMetadataCompat mediaMetadataCompat = this.f12311G;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat a2 = mediaMetadataCompat.a();
            CharSequence charSequence = a2.f7979b;
            if (charSequence != null) {
                wVar.f2460e = w.b(charSequence);
            }
            CharSequence charSequence2 = a2.f7980c;
            if (charSequence2 != null) {
                wVar.f2461f = w.b(charSequence2);
            }
            CharSequence charSequence3 = a2.f7981d;
            if (charSequence3 != null) {
                wVar.f2466l = w.b(charSequence3);
            }
            synchronized (this) {
                try {
                    Bitmap bitmap = this.f12312H;
                    if (bitmap != null) {
                        wVar.d(bitmap);
                    }
                } finally {
                }
            }
        }
        if (this.f12320z.f13239i) {
            wVar.f2462g = ((h) ((C1759x1) this.f12306B.f8077c).f17925b).f8047a.getSessionActivity();
        }
        int i8 = this.f12320z.f13236f;
        if (i8 != -1) {
            wVar.f2469o = i8;
        }
        Iterator it = this.f12308D.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar != null) {
                wVar.f2457b.add(qVar);
            }
        }
        C1569c c1569c = new C1569c();
        c1569c.f16012c = null;
        c1569c.f16013d = ((o) this.f12306B.f8076b).f8062c;
        if (Build.VERSION.SDK_INT < 33) {
            c1569c.f16012c = iArr;
        }
        if (this.f12320z.j) {
            f(1L);
            wVar.c(2);
        }
        wVar.e(c1569c);
        return wVar.a();
    }

    public final void h(C1148c c1148c) {
        this.f12320z = c1148c;
        String str = c1148c.f13233c;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.f12313I = str;
        if (c1148c.f13243n != null) {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent((String) null);
            intent.setComponent(new ComponentName(applicationContext, c1148c.f13243n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            f12301Q = PendingIntent.getActivity(applicationContext, zzbbd.zzq.zzf, intent, 201326592);
        } else {
            f12301Q = null;
        }
        if (c1148c.f13232b) {
            return;
        }
        ((o) this.f12306B.f8076b).f8060a.setMediaButtonReceiver(null);
    }

    public final int i(String str) {
        String[] split = str.split("/");
        String str2 = split[0];
        return getResources().getIdentifier(split[1], str2, getApplicationContext().getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:7:0x000c, B:46:0x001f, B:48:0x0025, B:50:0x0038, B:51:0x0040, B:53:0x0046, B:54:0x004a, B:11:0x0054, B:13:0x0060, B:16:0x00c8, B:19:0x006b, B:21:0x0071, B:23:0x007b, B:24:0x0086, B:27:0x00a3, B:29:0x00aa, B:31:0x00b0, B:32:0x0094, B:33:0x0098, B:35:0x009c, B:37:0x00a0, B:40:0x007f, B:42:0x00bb, B:43:0x00c0), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap j(String str, String str2) {
        FileDescriptor fileDescriptor;
        Bitmap bitmap = (Bitmap) this.f12314J.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Uri parse = Uri.parse(str);
            boolean equals = "content".equals(parse.getScheme());
            if (equals) {
                if (str2 != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            Size size = new Size(192, 192);
                            ContentResolver contentResolver = getContentResolver();
                            int i7 = this.f12320z.f13241l;
                            if (i7 == -1) {
                                i7 = size.getWidth();
                            }
                            int i8 = this.f12320z.f13242m;
                            if (i8 == -1) {
                                i8 = size.getHeight();
                            }
                            bitmap = contentResolver.loadThumbnail(parse, new Size(i7, i8), null);
                            if (bitmap == null) {
                                return null;
                            }
                        }
                    } catch (FileNotFoundException | IOException unused) {
                    }
                }
                ParcelFileDescriptor openFileDescriptor = getContentResolver().openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    fileDescriptor = openFileDescriptor.getFileDescriptor();
                    if (equals || fileDescriptor != null) {
                        if (this.f12320z.f13241l == -1) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            int i9 = 1;
                            options.inJustDecodeBounds = true;
                            if (fileDescriptor != null) {
                                BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            } else {
                                BitmapFactory.decodeFile(parse.getPath(), options);
                            }
                            C1148c c1148c = this.f12320z;
                            int i10 = c1148c.f13241l;
                            int i11 = c1148c.f13242m;
                            int i12 = options.outHeight;
                            int i13 = options.outWidth;
                            if (i12 > i11 || i13 > i10) {
                                int i14 = i12 / 2;
                                int i15 = i13 / 2;
                                while (i14 / i9 >= i11 && i15 / i9 >= i10) {
                                    i9 *= 2;
                                }
                            }
                            options.inSampleSize = i9;
                            options.inJustDecodeBounds = false;
                            bitmap = fileDescriptor != null ? BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options) : BitmapFactory.decodeFile(parse.getPath(), options);
                        } else {
                            bitmap = fileDescriptor != null ? BitmapFactory.decodeFileDescriptor(fileDescriptor) : BitmapFactory.decodeFile(parse.getPath());
                        }
                    }
                    this.f12314J.put(str, bitmap);
                    return bitmap;
                }
                return null;
            }
            fileDescriptor = null;
            if (equals) {
            }
            if (this.f12320z.f13241l == -1) {
            }
            this.f12314J.put(str, bitmap);
            return bitmap;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public final synchronized void k(MediaMetadataCompat mediaMetadataCompat) {
        try {
            String b7 = mediaMetadataCompat.b("artCacheFile");
            if (b7 != null) {
                this.f12312H = j(b7, null);
                C1719l1 c1719l1 = new C1719l1(mediaMetadataCompat);
                c1719l1.C("android.media.metadata.ALBUM_ART", this.f12312H);
                c1719l1.C("android.media.metadata.DISPLAY_ICON", this.f12312H);
                mediaMetadataCompat = new MediaMetadataCompat((Bundle) c1719l1.f17771a);
            } else {
                String b8 = mediaMetadataCompat.b("android.media.metadata.DISPLAY_ICON_URI");
                if (b8 == null || !b8.startsWith("content:")) {
                    this.f12312H = null;
                } else {
                    this.f12312H = j(b8, mediaMetadataCompat.b("loadThumbnailUri"));
                    C1719l1 c1719l12 = new C1719l1(mediaMetadataCompat);
                    c1719l12.C("android.media.metadata.ALBUM_ART", this.f12312H);
                    c1719l12.C("android.media.metadata.DISPLAY_ICON", this.f12312H);
                    mediaMetadataCompat = new MediaMetadataCompat((Bundle) c1719l12.f17771a);
                }
            }
            this.f12311G = mediaMetadataCompat;
            o oVar = (o) this.f12306B.f8076b;
            oVar.f8067h = mediaMetadataCompat;
            if (mediaMetadataCompat.f7992b == null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat.f7992b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            oVar.f8060a.setMetadata(mediaMetadataCompat.f7992b);
            this.f12317M.removeCallbacksAndMessages(null);
            this.f12317M.post(new K0(this, 26));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i7, Integer num, Integer num2, Integer num3) {
        C0686j c0686j;
        if (i7 == 1) {
            o oVar = (o) this.f12306B.f8076b;
            oVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            oVar.f8060a.setPlaybackToLocal(builder.build());
            this.f12318N = null;
            return;
        }
        if (i7 != 2) {
            return;
        }
        if (this.f12318N != null && num.intValue() == this.f12318N.f9210b) {
            int intValue = num2.intValue();
            C0686j c0686j2 = this.f12318N;
            if (intValue == c0686j2.f9211c) {
                int intValue2 = num3.intValue();
                c0686j2.f9212d = intValue2;
                y.a(c0686j2.b(), intValue2);
                t tVar = this.f12306B;
                c0686j = this.f12318N;
                if (c0686j != null) {
                    tVar.getClass();
                    throw new IllegalArgumentException("volumeProvider may not be null!");
                }
                o oVar2 = (o) tVar.f8076b;
                oVar2.getClass();
                oVar2.f8060a.setPlaybackToRemote(c0686j.b());
                return;
            }
        }
        this.f12318N = new C0686j(num.intValue(), num2.intValue(), num3.intValue());
        t tVar2 = this.f12306B;
        c0686j = this.f12318N;
        if (c0686j != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x01cd, code lost:
    
        if (r33.f12315K != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01cf, code lost:
    
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01d0, code lost:
    
        r17 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01d5, code lost:
    
        if (r33.f12315K != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(ArrayList arrayList, long j, int[] iArr, int i7, boolean z4, long j3, long j7, float f7, long j8, Integer num, String str, int i8, int i9, boolean z7, Long l7) {
        int i10;
        int i11;
        Iterator it;
        String str2;
        int i12;
        int i13;
        o oVar;
        o oVar2;
        o oVar3;
        Iterator it2;
        boolean z8;
        PlaybackStateCompat.CustomAction customAction;
        Bundle bundle;
        boolean z9;
        boolean z10 = !Arrays.equals(iArr, this.f12310F);
        if (!arrayList.equals(this.f12307C)) {
            z10 = true;
        }
        this.f12307C = arrayList;
        this.f12308D.clear();
        this.f12309E.clear();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            g5.n nVar = (g5.n) it3.next();
            int i14 = i(nVar.f13284a);
            String str3 = nVar.f13285b;
            m mVar = nVar.f13287d;
            if (mVar != null) {
                it2 = it3;
                String str4 = mVar.f13282a;
                if (TextUtils.isEmpty(str4)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(str3)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i14 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                Map map = mVar.f13283b;
                if (map == null) {
                    z8 = z10;
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    Iterator it4 = map.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        String obj = entry.getKey().toString();
                        Object value = entry.getValue();
                        Iterator it5 = it4;
                        if (value instanceof Integer) {
                            bundle.putInt(obj, ((Integer) value).intValue());
                            z9 = z10;
                        } else if (value instanceof Long) {
                            z9 = z10;
                            bundle.putLong(obj, ((Long) value).longValue());
                        } else {
                            z9 = z10;
                            bundle.putString(obj, value.toString());
                        }
                        z10 = z9;
                        it4 = it5;
                    }
                    z8 = z10;
                }
                customAction = new PlaybackStateCompat.CustomAction(str4, str3, i14, bundle);
            } else {
                it2 = it3;
                z8 = z10;
                if (Build.VERSION.SDK_INT >= 33) {
                    long j9 = nVar.f13286c;
                    if (j9 == 1) {
                        if (TextUtils.isEmpty("com.ryanheise.audioservice.action.STOP")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i14 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        customAction = new PlaybackStateCompat.CustomAction("com.ryanheise.audioservice.action.STOP", str3, i14, null);
                    } else if (j9 == 64) {
                        if (TextUtils.isEmpty("com.ryanheise.audioservice.action.FAST_FORWARD")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i14 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        customAction = new PlaybackStateCompat.CustomAction("com.ryanheise.audioservice.action.FAST_FORWARD", str3, i14, null);
                    } else if (j9 == 8) {
                        if (TextUtils.isEmpty("com.ryanheise.audioservice.action.REWIND")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i14 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        customAction = new PlaybackStateCompat.CustomAction("com.ryanheise.audioservice.action.REWIND", str3, i14, null);
                    }
                }
                customAction = null;
            }
            if (customAction != null) {
                this.f12309E.add(customAction);
            } else {
                this.f12308D.add(new q(i(nVar.f13284a), nVar.f13285b, f(nVar.f13286c)));
            }
            z10 = z8;
            it3 = it2;
        }
        boolean z11 = z10;
        Bundle bundle2 = null;
        this.f12310F = iArr;
        boolean z12 = this.f12315K;
        int i15 = this.f12319O;
        this.f12319O = i7;
        this.f12315K = z4;
        ArrayList arrayList2 = new ArrayList();
        long j10 = j | 3669711;
        int e7 = e.e(this.f12319O);
        if (e7 != 1) {
            int i16 = 2;
            if (e7 != 2) {
                if (e7 != 3) {
                    if (e7 != 4) {
                        if (e7 != 5) {
                            i11 = 0;
                        } else {
                            i10 = 7;
                        }
                    }
                }
                it = this.f12309E.iterator();
                while (it.hasNext()) {
                    PlaybackStateCompat.CustomAction customAction2 = (PlaybackStateCompat.CustomAction) it.next();
                    if (customAction2 == null) {
                        throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
                    }
                    arrayList2.add(customAction2);
                }
                long longValue = l7 == null ? l7.longValue() : -1L;
                if (num == null && str != null) {
                    i13 = num.intValue();
                } else {
                    if (str != null) {
                        str2 = null;
                        i12 = 0;
                        if (this.f12311G != null) {
                            bundle2 = new Bundle();
                            bundle2.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", this.f12311G.a().f7978a);
                        }
                        this.f12306B.y0(new PlaybackStateCompat(i11, j3, j7, f7, j10, i12, str2, j8, arrayList2, longValue, bundle2));
                        oVar = (o) this.f12306B.f8076b;
                        if (oVar.j != i8) {
                            oVar.j = i8;
                            synchronized (oVar.f8063d) {
                                for (int beginBroadcast = oVar.f8064e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                                    try {
                                        ((android.support.v4.media.session.b) oVar.f8064e.getBroadcastItem(beginBroadcast)).b(i8);
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
                                for (int beginBroadcast2 = oVar2.f8064e.beginBroadcast() - 1; beginBroadcast2 >= 0; beginBroadcast2--) {
                                    try {
                                        ((android.support.v4.media.session.b) oVar2.f8064e.getBroadcastItem(beginBroadcast2)).b0(i9);
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
                                for (int beginBroadcast3 = oVar3.f8064e.beginBroadcast() - 1; beginBroadcast3 >= 0; beginBroadcast3--) {
                                    try {
                                        ((android.support.v4.media.session.b) oVar3.f8064e.getBroadcastItem(beginBroadcast3)).F(z7);
                                    } catch (RemoteException unused3) {
                                    }
                                }
                                oVar3.f8064e.finishBroadcast();
                            }
                        }
                        if (z12 && z4) {
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
                        } else if (z12 && !z4 && this.f12320z.f13240k) {
                            stopForeground(0);
                            if (this.f12305A.isHeld()) {
                                this.f12305A.release();
                            }
                        }
                        if (i15 == 1 && i7 == 1) {
                            if (this.f12306B.p0()) {
                                this.f12306B.w0(false);
                            }
                            ((NotificationManager) getSystemService("notification")).cancel(1124);
                            stopSelf();
                            return;
                        }
                        if (i7 == 1 && z11 && this.f12316L) {
                            ((NotificationManager) getSystemService("notification")).notify(1124, g());
                            return;
                        }
                        return;
                    }
                    i13 = -987654;
                }
                str2 = str;
                i12 = i13;
                if (this.f12311G != null) {
                }
                this.f12306B.y0(new PlaybackStateCompat(i11, j3, j7, f7, j10, i12, str2, j8, arrayList2, longValue, bundle2));
                oVar = (o) this.f12306B.f8076b;
                if (oVar.j != i8) {
                }
                oVar2 = (o) this.f12306B.f8076b;
                if (oVar2.f8069k != i9) {
                }
                oVar3 = (o) this.f12306B.f8076b;
                if (oVar3.f8068i != z7) {
                }
                if (z12) {
                }
                if (z12) {
                    stopForeground(0);
                    if (this.f12305A.isHeld()) {
                    }
                }
                if (i15 == 1) {
                }
                if (i7 == 1) {
                    return;
                } else {
                    return;
                }
            }
            i10 = 6;
        } else {
            i10 = 8;
        }
        i11 = i10;
        it = this.f12309E.iterator();
        while (it.hasNext()) {
        }
        long longValue2 = l7 == null ? l7.longValue() : -1L;
        if (num == null) {
        }
        if (str != null) {
        }
    }

    @Override // q0.s, android.app.Service
    public final void onCreate() {
        super.onCreate();
        f12300P = this;
        this.f12316L = false;
        this.f12315K = false;
        this.f12319O = 1;
        this.f12306B = new t(this);
        h(new C1148c(getApplicationContext()));
        ((o) this.f12306B.f8076b).f8060a.setFlags(7);
        this.f12306B.y0(new PlaybackStateCompat(0, 0L, 0L, 0.0f, 3669711L, 0, null, 0L, new ArrayList(), -1L, null));
        t tVar = this.f12306B;
        ((o) tVar.f8076b).e(new C1147b(this), new Handler());
        MediaSessionCompat$Token mediaSessionCompat$Token = ((o) this.f12306B.f8076b).f8062c;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f15783x != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f15783x = mediaSessionCompat$Token;
        j jVar = this.f15777a;
        ((s) jVar.f3681e).f15782f.a(new x(8, jVar, mediaSessionCompat$Token));
        this.f12306B.z0(f12303S);
        this.f12305A = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.f12314J = new C1146a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
        l.i(this);
        System.out.println("flutterEngine warmed up");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        r2 = (r5.C1577b) G4.C0286t.b().f3024a.get("audio_service_engine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r2.a();
        G4.C0286t.b().c("audio_service_engine", null);
     */
    @Override // q0.s, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDestroy() {
        super.onDestroy();
        if (f12302R != null) {
            HashSet hashSet = l.f13273x;
            synchronized (l.class) {
                Iterator it = l.f13273x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((g5.j) it.next()).f13260b != null) {
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
        stopForeground(!this.f12320z.f13232b ? 1 : 0);
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
        C1759x1 c1759x1 = (C1759x1) tVar.f8077c;
        if (keyEvent != null) {
            ((h) c1759x1.f17925b).f8047a.dispatchMediaButtonEvent(keyEvent);
            return 2;
        }
        c1759x1.getClass();
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
