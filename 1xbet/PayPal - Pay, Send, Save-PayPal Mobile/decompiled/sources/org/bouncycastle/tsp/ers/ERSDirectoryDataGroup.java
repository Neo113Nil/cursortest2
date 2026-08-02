package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSDirectoryDataGroup extends org.bouncycastle.tsp.ers.ERSDataGroup {
    public java.util.List<org.bouncycastle.tsp.ers.ERSDirectoryDataGroup> getSubdirectories() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i != this.dataObjects.size(); i++) {
            if (this.dataObjects.get(i) instanceof org.bouncycastle.tsp.ers.ERSDirectoryDataGroup) {
                arrayList.add((org.bouncycastle.tsp.ers.ERSDirectoryDataGroup) this.dataObjects.get(i));
            }
        }
        return arrayList;
    }

    public java.util.List<org.bouncycastle.tsp.ers.ERSFileData> getFiles() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i != this.dataObjects.size(); i++) {
            if (this.dataObjects.get(i) instanceof org.bouncycastle.tsp.ers.ERSFileData) {
                arrayList.add((org.bouncycastle.tsp.ers.ERSFileData) this.dataObjects.get(i));
            }
        }
        return arrayList;
    }

    private static java.util.List<org.bouncycastle.tsp.ers.ERSData> getHighSpeedVideoSizes(java.io.File file) throws java.io.FileNotFoundException {
        org.bouncycastle.tsp.ers.ERSCachingData eRSFileData;
        if (!file.isDirectory()) {
            throw new java.lang.IllegalArgumentException("file reference does not refer to directory");
        }
        java.io.File[] listFiles = file.listFiles();
        java.util.ArrayList arrayList = new java.util.ArrayList(listFiles.length);
        for (int i = 0; i != listFiles.length; i++) {
            if (!listFiles[i].isDirectory()) {
                eRSFileData = new org.bouncycastle.tsp.ers.ERSFileData(listFiles[i]);
            } else if (listFiles[i].listFiles().length != 0) {
                eRSFileData = new org.bouncycastle.tsp.ers.ERSDirectoryDataGroup(listFiles[i]);
            }
            arrayList.add(eRSFileData);
        }
        return arrayList;
    }

    public ERSDirectoryDataGroup(java.io.File file) throws java.io.FileNotFoundException {
        super(getHighSpeedVideoSizes(file));
    }
}
