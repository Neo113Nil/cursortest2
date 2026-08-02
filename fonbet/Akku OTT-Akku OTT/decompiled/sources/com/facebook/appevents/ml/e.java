package com.facebook.appevents.ml;

import androidx.compose.runtime.C0211b;
import com.facebook.appevents.internal.l;
import com.facebook.appevents.ml.d;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements l.a, BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00d9  */
    @Override // com.facebook.appevents.internal.l.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(File file) {
        int available;
        byte[] bArr;
        HashMap hashMap;
        int i;
        HashMap hashMap2;
        final b bVar;
        HashMap hashMap3;
        ArrayList slaves = (ArrayList) this.b;
        Intrinsics.checkNotNullParameter(slaves, "$slaves");
        Intrinsics.checkNotNullParameter(file, "file");
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        h hVar = h.a;
        if (!com.facebook.internal.instrument.crashshield.a.b(h.class)) {
            try {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    available = fileInputStream.available();
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    bArr = new byte[available];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, h.class);
            }
            if (available >= 4) {
                int i2 = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i3 = wrap.getInt();
                int i4 = i3 + 4;
                if (available >= i4) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i3, Charsets.UTF_8));
                    JSONArray names = jSONObject.names();
                    int length = names.length();
                    String[] strArr = new String[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        strArr[i5] = names.getString(i5);
                    }
                    ArraysKt.sort((Object[]) strArr);
                    hashMap = new HashMap();
                    int i6 = 0;
                    while (i6 < length) {
                        String str = strArr[i6];
                        if (str == null) {
                            i = i2;
                        } else {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i7 = 1;
                            for (int i8 = i2; i8 < length2; i8++) {
                                int i9 = jSONArray.getInt(i8);
                                iArr[i8] = i9;
                                i7 *= i9;
                            }
                            int i10 = i7 * 4;
                            int i11 = i4 + i10;
                            if (i11 <= available) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i4, i10);
                                wrap2.order(ByteOrder.LITTLE_ENDIAN);
                                a aVar = new a(iArr);
                                i = 0;
                                wrap2.asFloatBuffer().get(aVar.c, 0, i7);
                                hashMap.put(str, aVar);
                                i4 = i11;
                            }
                        }
                        i6++;
                        i2 = i;
                    }
                    if (hashMap != null) {
                        hashMap2 = new HashMap();
                        if (!com.facebook.internal.instrument.crashshield.a.b(b.class)) {
                            try {
                                hashMap3 = b.m;
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, b.class);
                            }
                            for (Map.Entry entry : hashMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                if (!hashMap3.containsKey(entry.getKey()) || (str2 = (String) hashMap3.get(entry.getKey())) != null) {
                                    hashMap2.put(str2, entry.getValue());
                                }
                            }
                            if (hashMap2 != null) {
                                try {
                                    bVar = new b(hashMap2);
                                } catch (Exception unused2) {
                                }
                                if (bVar != null) {
                                    Iterator it = slaves.iterator();
                                    while (it.hasNext()) {
                                        final d.b bVar2 = (d.b) it.next();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(bVar2.a);
                                        sb.append('_');
                                        String a = C0211b.a(sb, bVar2.d, "_rule");
                                        d.b.a aVar2 = d.b.Companion;
                                        String str3 = bVar2.c;
                                        l.a aVar3 = new l.a() { // from class: com.facebook.appevents.ml.f
                                            @Override // com.facebook.appevents.internal.l.a
                                            public final void a(File file2) {
                                                d.b slave = d.b.this;
                                                Intrinsics.checkNotNullParameter(slave, "$slave");
                                                Intrinsics.checkNotNullParameter(file2, "file");
                                                slave.g = bVar;
                                                slave.f = file2;
                                                Runnable runnable = slave.h;
                                                if (runnable != null) {
                                                    runnable.run();
                                                }
                                            }
                                        };
                                        aVar2.getClass();
                                        d.b.a.b(str3, a, aVar3);
                                    }
                                    return;
                                }
                                return;
                            }
                            bVar = null;
                            if (bVar != null) {
                            }
                        }
                        hashMap3 = null;
                        while (r3.hasNext()) {
                        }
                        if (hashMap2 != null) {
                        }
                        bVar = null;
                        if (bVar != null) {
                        }
                    }
                    hashMap2 = null;
                    if (hashMap2 != null) {
                    }
                    bVar = null;
                    if (bVar != null) {
                    }
                }
            }
        }
        hashMap = null;
        if (hashMap != null) {
        }
        hashMap2 = null;
        if (hashMap2 != null) {
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 1:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$6((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            case 2:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$12$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiFlutterAssetManager.pigeon_newInstance$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", obj);
    }
}
