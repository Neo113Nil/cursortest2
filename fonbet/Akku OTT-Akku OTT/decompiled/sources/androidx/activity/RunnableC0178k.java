package androidx.activity;

import android.database.Cursor;
import android.graphics.SurfaceTexture;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.HashMap;

/* renamed from: androidx.activity.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0178k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0178k(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ComponentActivity) this.b).addObserverForBackInvoker((OnBackPressedDispatcher) this.c);
                return;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$audioTrackReleased$11((AudioSink.AudioTrackConfig) this.c);
                return;
            case 2:
                ((SphericalGLSurfaceView) this.b).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) this.c);
                return;
            case 3:
                com.tekartik.sqflite.d dVar = (com.tekartik.sqflite.d) this.b;
                com.tekartik.sqflite.operation.c cVar = (com.tekartik.sqflite.operation.c) this.c;
                HashMap hashMap = dVar.g;
                MethodCall methodCall = cVar.b;
                Integer num = (Integer) methodCall.argument("cursorId");
                int intValue = num.intValue();
                boolean equals = Boolean.TRUE.equals(methodCall.argument("cancel"));
                if (com.baseflow.permissionhandler.a.b(dVar.d)) {
                    dVar.g();
                }
                com.tekartik.sqflite.l lVar = null;
                if (equals) {
                    com.tekartik.sqflite.l lVar2 = (com.tekartik.sqflite.l) hashMap.get(num);
                    if (lVar2 != null) {
                        dVar.a(lVar2);
                    }
                    cVar.success(null);
                    return;
                }
                com.tekartik.sqflite.l lVar3 = (com.tekartik.sqflite.l) hashMap.get(num);
                boolean z = false;
                try {
                    try {
                        if (lVar3 == null) {
                            throw new IllegalStateException("Cursor " + intValue + " not found");
                        }
                        Cursor cursor = lVar3.c;
                        HashMap b = com.tekartik.sqflite.d.b(cursor, Integer.valueOf(lVar3.b));
                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                            z = true;
                        }
                        if (z) {
                            b.put("cursorId", num);
                        }
                        cVar.success(b);
                        if (z) {
                            return;
                        }
                        dVar.a(lVar3);
                        return;
                    } catch (Exception e) {
                        dVar.h(e, cVar);
                        if (lVar3 != null) {
                            dVar.a(lVar3);
                        } else {
                            lVar = lVar3;
                        }
                        if (0 != 0 || lVar == null) {
                            return;
                        }
                        dVar.a(lVar);
                        return;
                    }
                } catch (Throwable th) {
                    if (0 == 0 && lVar3 != null) {
                        dVar.a(lVar3);
                    }
                    throw th;
                }
            default:
                FlutterFirebaseMessagingPlugin.lambda$getPluginConstantsForFirebaseApp$15((FirebaseApp) this.b, (TaskCompletionSource) this.c);
                return;
        }
    }
}
