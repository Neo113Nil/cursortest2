package com.bytedance.sdk.openadsdk.sf;

import com.bytedance.sdk.component.utils.qf;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public abstract class pcc {
    protected boolean pcc = false;
    private final ExecutorService sf = Executors.newSingleThreadExecutor();

    protected abstract void pcc(List<File> list);

    protected abstract boolean pcc(long j, int i);

    protected abstract boolean pcc(File file, long j, int i);

    public void pcc(File file) throws IOException {
        this.sf.submit(new CallableC0204pcc(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(File file) throws IOException {
        if (this.pcc) {
            List<File> pcc = qf.pcc(file);
            new Object[]{"touchInBackground", pcc.toString()};
            pcc(pcc);
        } else {
            try {
                qf.sf(file);
            } catch (Throwable unused) {
            }
            pcc(qf.pcc(file.getParentFile()));
        }
    }

    long sf(List<File> list) {
        Iterator<File> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().length();
        }
        return j;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.sf.pcc$pcc, reason: collision with other inner class name */
    private class CallableC0204pcc implements Callable<Void> {
        private final File sf;

        private CallableC0204pcc(File file) {
            this.sf = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            pcc.this.sf(this.sf);
            return null;
        }
    }
}
