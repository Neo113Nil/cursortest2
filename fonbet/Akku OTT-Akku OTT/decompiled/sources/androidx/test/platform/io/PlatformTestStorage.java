package androidx.test.platform.io;

import androidx.test.annotation.ExperimentalTestApi;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Map;

@ExperimentalTestApi
/* loaded from: classes3.dex */
public interface PlatformTestStorage {
    void addOutputProperties(Map<String, Serializable> map);

    String getInputArg(String str);

    Map<String, String> getInputArgs();

    Map<String, Serializable> getOutputProperties();

    InputStream openInputFile(String str) throws IOException;

    InputStream openInternalInputFile(String str) throws IOException;

    OutputStream openInternalOutputFile(String str) throws IOException;

    OutputStream openOutputFile(String str) throws IOException;

    OutputStream openOutputFile(String str, boolean z) throws IOException;
}
