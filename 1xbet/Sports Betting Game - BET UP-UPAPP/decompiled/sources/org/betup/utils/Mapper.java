package org.betup.utils;

import org.modelmapper.ModelMapper;

/* loaded from: classes4.dex */
public final class Mapper {
    private static final ModelMapper instance = new ModelMapper();

    private Mapper() {
    }

    public static ModelMapper getInstance() {
        return instance;
    }
}
