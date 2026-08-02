package androidx.test.platform.io;

import android.os.Bundle;
import androidx.test.annotation.ExperimentalTestApi;
import androidx.test.platform.app.InstrumentationRegistry;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@ExperimentalTestApi
/* loaded from: classes3.dex */
public final class FileTestStorage implements PlatformTestStorage {
    private static final String TAG = "FileTestStorage";
    private final OutputDirCalculator outputDirCalculator = new OutputDirCalculator();

    @Override // androidx.test.platform.io.PlatformTestStorage
    public void addOutputProperties(Map<String, Serializable> map) {
    }

    @Override // androidx.test.platform.io.PlatformTestStorage
    public String getInputArg(String str) {
        return InstrumentationRegistry.getArguments().getString(str);
    }

    @Override // androidx.test.platform.io.PlatformTestStorage
    public Map<String, String> getInputArgs() {
        HashMap hashMap = new HashMap();
        Bundle arguments = InstrumentationRegistry.getArguments();
        for (String str : arguments.keySet()) {
            hashMap.put(str, arguments.getString(str));
        }
        return hashMap;
    }

    @Override // androidx.test.platform.io.PlatformTestStorage
    public Map<String, Serializable> getOutputProperties() {
        return Collections.EMPTY_MAP;
    }

    @Override // androidx.test.platform.io.PlatformTestStorage
    public InputStream openInputFile(String str) throws IOException {
        File file = new File(str);
        return file.isAbsolute() ? new FileInputStream(file) : InstrumentationRegistry.getInstrumentation().getContext().getAssets().open(str);
    }

    @Override // androidx.test.platform.io.PlatformTestStorage
    public InputStream openInternalInputFile(String str) throws IOException {
        return openInputFile(str);
    }

    @Override // androidx.test.platform.io.PlatformTestStorage
    public OutputStream openInternalOutputFile(String str) throws IOException {
        return openOutputFile(str);
    }

    @Override // androidx.test.platform.io.PlatformTestStorage
    public OutputStream openOutputFile(String str) throws IOException {
        File file = new File(str);
        if (!file.isAbsolute()) {
            file = new File(this.outputDirCalculator.getOutputDir(), str);
        }
        return new FileOutputStream(file);
    }

    @Override // androidx.test.platform.io.PlatformTestStorage
    public OutputStream openOutputFile(String str, boolean z) throws IOException {
        File file = new File(str);
        if (!file.isAbsolute()) {
            file = new File(this.outputDirCalculator.getOutputDir(), str);
        }
        return new FileOutputStream(file, z);
    }
}
