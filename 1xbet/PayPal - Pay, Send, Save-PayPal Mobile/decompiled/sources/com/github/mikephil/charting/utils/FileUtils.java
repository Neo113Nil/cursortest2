package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public class FileUtils {
    public static java.util.List<com.github.mikephil.charting.data.Entry> loadEntriesFromFile(java.lang.String str) {
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                java.lang.String[] split = readLine.split("#");
                if (split.length <= 2) {
                    arrayList.add(new com.github.mikephil.charting.data.Entry(java.lang.Float.parseFloat(split[0]), java.lang.Integer.parseInt(split[1])));
                } else {
                    int length = split.length - 1;
                    float[] fArr = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr[i] = java.lang.Float.parseFloat(split[i]);
                    }
                    arrayList.add(new com.github.mikephil.charting.data.BarEntry(java.lang.Integer.parseInt(split[split.length - 1]), fArr));
                }
            }
        } catch (java.io.IOException unused) {
        }
        return arrayList;
    }

    public static java.util.List<com.github.mikephil.charting.data.Entry> loadEntriesFromAssets(android.content.res.AssetManager assetManager, java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(assetManager.open(str), "UTF-8"));
            } catch (java.io.IOException unused) {
                return arrayList;
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            for (java.lang.String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                java.lang.String[] split = readLine.split("#");
                if (split.length <= 2) {
                    arrayList.add(new com.github.mikephil.charting.data.Entry(java.lang.Float.parseFloat(split[1]), java.lang.Float.parseFloat(split[0])));
                } else {
                    int length = split.length - 1;
                    float[] fArr = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr[i] = java.lang.Float.parseFloat(split[i]);
                    }
                    arrayList.add(new com.github.mikephil.charting.data.BarEntry(java.lang.Integer.parseInt(split[split.length - 1]), fArr));
                }
            }
            bufferedReader.close();
            return arrayList;
        } catch (java.io.IOException unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            return arrayList;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (java.io.IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static void saveToSdCard(java.util.List<com.github.mikephil.charting.data.Entry> list, java.lang.String str) {
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (java.io.IOException unused) {
            }
        }
        try {
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(file, true));
            for (com.github.mikephil.charting.data.Entry entry : list) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(entry.getY());
                sb.append("#");
                sb.append(entry.getX());
                bufferedWriter.append((java.lang.CharSequence) sb.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (java.io.IOException unused2) {
        }
    }

    public static java.util.List<com.github.mikephil.charting.data.BarEntry> loadBarEntriesFromAssets(android.content.res.AssetManager assetManager, java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(assetManager.open(str), "UTF-8"));
            } catch (java.io.IOException unused) {
                return arrayList;
            }
            try {
                for (java.lang.String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    java.lang.String[] split = readLine.split("#");
                    arrayList.add(new com.github.mikephil.charting.data.BarEntry(java.lang.Float.parseFloat(split[1]), java.lang.Float.parseFloat(split[0])));
                }
                bufferedReader.close();
                return arrayList;
            } catch (java.io.IOException unused2) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused4) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
