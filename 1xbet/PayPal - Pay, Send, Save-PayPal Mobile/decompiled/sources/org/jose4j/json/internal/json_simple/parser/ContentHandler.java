package org.jose4j.json.internal.json_simple.parser;

/* loaded from: classes18.dex */
public interface ContentHandler {
    boolean endArray() throws org.jose4j.json.internal.json_simple.parser.ParseException, java.io.IOException;

    void endJSON() throws org.jose4j.json.internal.json_simple.parser.ParseException, java.io.IOException;

    boolean endObject() throws org.jose4j.json.internal.json_simple.parser.ParseException, java.io.IOException;

    boolean endObjectEntry() throws org.jose4j.json.internal.json_simple.parser.ParseException, java.io.IOException;

    boolean primitive(java.lang.Object obj) throws org.jose4j.json.internal.json_simple.parser.ParseException, java.io.IOException;

    boolean startArray() throws org.jose4j.json.internal.json_simple.parser.ParseException, java.io.IOException;

    void startJSON() throws org.jose4j.json.internal.json_simple.parser.ParseException, java.io.IOException;

    boolean startObject() throws org.jose4j.json.internal.json_simple.parser.ParseException, java.io.IOException;

    boolean startObjectEntry(java.lang.String str) throws org.jose4j.json.internal.json_simple.parser.ParseException, java.io.IOException;
}
