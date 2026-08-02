package org.modelmapper.internal.asm.tree;

import java.util.List;
import org.modelmapper.internal.asm.ModuleVisitor;

/* loaded from: classes4.dex */
public class ModuleProvideNode {
    public List<String> providers;
    public String service;

    public ModuleProvideNode(String str, List<String> list) {
        this.service = str;
        this.providers = list;
    }

    public void accept(ModuleVisitor moduleVisitor) {
        String str = this.service;
        List<String> list = this.providers;
        moduleVisitor.visitProvide(str, (String[]) list.toArray(new String[list.size()]));
    }
}
