package defpackage;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;
import okio.ByteString;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class jhOZP2kU3fsYi implements Function0 {
    public final /* synthetic */ long b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ jhOZP2kU3fsYi(int i, long j, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.gmXBnHsR2YSm = obj;
        this.b41X89IqSbKt = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        boolean z;
        WebSocketWriter webSocketWriter;
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                Brush brush = (Brush) this.gmXBnHsR2YSm;
                long j = this.b41X89IqSbKt;
                int i = AndroidTextPaint.UEutaskTsxaI;
                return ((ShaderBrush) brush).hRNgd2zGCE5kj(j);
            case 1:
                Http2Connection http2Connection = (Http2Connection) this.gmXBnHsR2YSm;
                long j2 = this.b41X89IqSbKt;
                Settings settings = Http2Connection.Yey4RyhSyBRHub;
                synchronized (http2Connection) {
                    long j3 = http2Connection.GiTAvmtrM6Bh8SJ;
                    long j4 = http2Connection.NIabVTHf6LMJyXq;
                    if (j3 < j4) {
                        z = true;
                    } else {
                        http2Connection.NIabVTHf6LMJyXq = j4 + 1;
                        z = false;
                    }
                }
                if (z) {
                    ErrorCode errorCode = ErrorCode.i7xAcZoXXiIt;
                    http2Connection.yzPsTade5rL7D3(errorCode, errorCode, null);
                    j2 = -1;
                } else {
                    try {
                        http2Connection.BD2CRjLJ8EtOqGQ.pu0JZhzR2Or6(1, 0, false);
                    } catch (IOException e) {
                        ErrorCode errorCode2 = ErrorCode.i7xAcZoXXiIt;
                        http2Connection.yzPsTade5rL7D3(errorCode2, errorCode2, e);
                    }
                }
                return Long.valueOf(j2);
            default:
                RealWebSocket realWebSocket = (RealWebSocket) this.gmXBnHsR2YSm;
                long j5 = this.b41X89IqSbKt;
                List list = RealWebSocket.BD2CRjLJ8EtOqGQ;
                synchronized (realWebSocket) {
                    try {
                        if (!realWebSocket.XrorSzThrtvJ4A && (webSocketWriter = realWebSocket.yRx9jbDCTnXb3) != null) {
                            int i2 = realWebSocket.uY26rxeEAFnDq ? realWebSocket.ZvpnNpCMEWSR3 : -1;
                            realWebSocket.ZvpnNpCMEWSR3++;
                            realWebSocket.uY26rxeEAFnDq = true;
                            if (i2 != -1) {
                                RealWebSocket.UEutaskTsxaI(realWebSocket, new SocketTimeoutException("sent ping but didn't receive pong within " + realWebSocket.gmXBnHsR2YSm + "ms (after " + (i2 - 1) + " successful ping/pongs)"), null, 2);
                            } else {
                                try {
                                    ByteString byteString = ByteString.i7xAcZoXXiIt;
                                    byteString.getClass();
                                    webSocketWriter.yzPsTade5rL7D3(9, byteString);
                                } catch (IOException e2) {
                                    RealWebSocket.UEutaskTsxaI(realWebSocket, e2, null, 2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j5);
        }
    }
}
