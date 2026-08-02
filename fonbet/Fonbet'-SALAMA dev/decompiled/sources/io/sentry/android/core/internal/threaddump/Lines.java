package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Lines {
    private final ArrayList<? extends Line> mList;
    private final int mMax;
    private final int mMin = 0;
    public int pos;

    public Lines(ArrayList<? extends Line> arrayList) {
        this.mList = arrayList;
        this.mMax = arrayList.size();
    }

    public static Lines readLines(File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            Lines readLines = readLines(bufferedReader);
            bufferedReader.close();
            return readLines;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean hasNext() {
        return this.pos < this.mMax;
    }

    public Line next() {
        int i7 = this.pos;
        if (i7 < this.mMin || i7 >= this.mMax) {
            return null;
        }
        ArrayList<? extends Line> arrayList = this.mList;
        this.pos = i7 + 1;
        return arrayList.get(i7);
    }

    public void rewind() {
        this.pos--;
    }

    public static Lines readLines(BufferedReader bufferedReader) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                i7++;
                arrayList.add(new Line(i7, readLine));
            } else {
                return new Lines(arrayList);
            }
        }
    }
}
