package P8;

import M8.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f22008a = Logger.getLogger(b.class.getName());

    private b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(InputStream inputStream) {
        Throwable th2;
        IOException e11;
        Logger logger = f22008a;
        if (inputStream == null) {
            return Collections.EMPTY_LIST;
        }
        InputStream inputStream2 = null;
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                try {
                    h hVar = new h();
                    hVar.readExternal(objectInputStream);
                    if (hVar.a().isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    ArrayList a11 = hVar.a();
                    try {
                        objectInputStream.close();
                        return a11;
                    } catch (IOException e12) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e12);
                        return a11;
                    }
                } catch (IOException e13) {
                    e11 = e13;
                    throw new IllegalStateException("Unable to parse metadata file", e11);
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (0 == 0) {
                    try {
                        inputStream2.close();
                    } catch (IOException e14) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e14);
                    }
                } else {
                    try {
                        inputStream.close();
                    } catch (IOException e15) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e15);
                    }
                }
                throw th2;
            }
        } catch (IOException e16) {
            e11 = e16;
        } catch (Throwable th4) {
            th2 = th4;
            if (0 == 0) {
            }
            throw th2;
        }
    }
}
