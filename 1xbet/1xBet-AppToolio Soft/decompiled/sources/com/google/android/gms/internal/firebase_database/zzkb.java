package com.google.android.gms.internal.firebase_database;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
final class zzkb {
    private zzjr zzty;
    private BlockingQueue<ByteBuffer> zzuc;
    private WritableByteChannel zzue;
    private final Random zzgf = new Random();
    private volatile boolean zzub = false;
    private boolean zzud = false;
    private final Thread zzth = zzjr.getThreadFactory().newThread(new zzkc(this));

    zzkb(zzjr zzjrVar, String str, int i) {
        zzjq zzgi = zzjr.zzgi();
        Thread thread = this.zzth;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
        sb.append(str);
        sb.append("Writer-");
        sb.append(i);
        zzgi.zza(thread, sb.toString());
        this.zzty = zzjrVar;
        this.zzuc = new LinkedBlockingQueue();
    }

    private final void zzgq() throws InterruptedException, IOException {
        this.zzue.write(this.zzuc.take());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzgs() {
        while (!this.zzub && !Thread.interrupted()) {
            try {
                zzgq();
            } catch (IOException e) {
                this.zzty.zzb(new zzjx("IO Exception", e));
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        for (int i = 0; i < this.zzuc.size(); i++) {
            zzgq();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r5.zzud = true;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zza(byte b, boolean z, byte[] bArr) throws IOException {
        int length = bArr.length;
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + (length >= 126 ? length <= 65535 ? 8 : 14 : 6));
        allocate.put((byte) (b | Byte.MIN_VALUE));
        if (length < 126) {
            allocate.put((byte) (length | 128));
        } else if (length <= 65535) {
            allocate.put((byte) -2);
            allocate.putShort((short) length);
        } else {
            allocate.put((byte) -1);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        byte[] bArr2 = new byte[4];
        this.zzgf.nextBytes(bArr2);
        allocate.put(bArr2);
        for (int i = 0; i < bArr.length; i++) {
            allocate.put((byte) (bArr[i] ^ bArr2[i % 4]));
        }
        allocate.flip();
        if (this.zzub && (this.zzud || b != 8)) {
            throw new zzjx("Shouldn't be sending");
        }
        this.zzuc.add(allocate);
    }

    final void zza(OutputStream outputStream) {
        this.zzue = Channels.newChannel(outputStream);
    }

    final void zzgr() {
        this.zzub = true;
    }

    final Thread zzgt() {
        return this.zzth;
    }
}
